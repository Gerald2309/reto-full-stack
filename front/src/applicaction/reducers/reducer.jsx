import LIST_ACTIONS from '../actions/listActions';
import TODO_ACTIONS from '../actions/todoActions';

export const reducer = (state, action) => {
    const actions = {
        [LIST_ACTIONS.LIST_FINDED]: listFinded.bind(this),
        [LIST_ACTIONS.LIST_DELETED]: listDeleted.bind(this),
        [LIST_ACTIONS.LIST_CREATED]: listCreated.bind(this),
        [TODO_ACTIONS.TODO_CREATED]: todoCreated.bind(this),
        [TODO_ACTIONS.TODO_DELETED]: todoDeleted.bind(this),

    }
    return actions [actions.type](state, action.payload);
}

const listFinded = (state, payload) => {
    return {...state, list: {items: payload}}
}

const listDeleted = (state, payload) => {
    const items = state.list.items.filter(item => item.id !== payload)
    return {...state, list: {items}}
}

const listCreated = (state, playload) => {
    const newList = {...playload, todos:[]}
    return {...state, list: {items: [...state.list.items, newList]}}
}

const todoDeleted = (state, playload) => {
    const item = state.list.items.find(item => item.id === playload.listId);
    const items = state.list.items.find(item => item.id !== playload.listId);
    const newItem = {...item, todos: item.todos.filter(todo => todo.id !== playload.todoId)}
    return {...state, list: {items: [...items, newItem]}}
}

const todoCreated = (state,playload) => {
    const item = state.list.items.find(item => item.id === playload.listId);
    const items = state.list.items.find(item => item.id !== playload.listId);
    const newItem = {...item, todos:[...item.todos, playload]}
    return {...state, list: {items: [...items, newItem]}}
}