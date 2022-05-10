import React, { useEffect, useContext, useState, useRef } from 'react';
import LIST_ACTIONS from '../../application/actions/listActions';
import { Store } from '../../application/store';
import service from '../../infraestructure/services/listService';
import { List } from './List';
import { v4 as uuidv4 } from 'uuid';


export const Lists = () => {
    const {state, dispatch} = useContext(Store);
    const formRef = useRef(null);
    const [listName, setListName] = useState();

    useEffect(() => service.getAll()
    .then(response => response.json())
    .then(response =>dispatch({ type: LIST_ACTIONS.LIST_FINDED, playload: response})),
    [dispatch]);

    const creatList = (event) => {
        event.preventDefault();
        const body = {id: uuidv4(), label: listName};
        service.create(body)
        .then(response => response.json())
        .then(response => {
            dispatch({ type: LIST_ACTIONS.LIST_CREATED, playload: response});
            formRef.current.reset();
        })
    };

    return (
        <>
            <form ref={formRef}>
                <input type = "text"  placeholder = "Ingrese el nombre de la nueva lista" 
                onChange = {(event) => setListName(event.target.value)}></input>
                <button className = 'create-list-button' onClick = {createList}> Crear </button>
            </form>
            <div className='lists'>
                {state.list.items && state.list.items.map(item => <List key={item.id} item={item} />)}
            </div>
        </>
    )
}
