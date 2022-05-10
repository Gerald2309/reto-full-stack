import env from "./environment";

export default {
    todo: `${env.apiUrl}/toDo`,
    list: `${env.apiUrl}/listToDo`,
    deleteList: listId => `${env.apiUrl}/listToDo/${listId}`,
    deleteTodo: todoId => `${env.apiUrl}/toDo/${todoId}`,
}