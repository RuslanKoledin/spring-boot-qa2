 Коледин Руслан java-22
 Сервис который принимает HTTP запросы и отвечает на них
 чтобы протестировать сервис перейдите
 к application.properties(src/main/resources/application.properties)
 пароль , логин укажите свой. Также создайте базу qa_base(или используйте любую пустую бд)
 также если будет ошибка на порт(8181),поменяйте на другой(8282 и тд)
 Далее по роуту переходите в браузер или postman и вписываем в поисковую строку
 localhost:8181/city/*
 localhost:8181/shop/*
 localhost:8181/street/*
 delete-удаляем сущность
 update-обновляем сущность
 save-сохраняем сущность
 getById-вытаскиваем нужному id сущность
 getAll-вытаскиваем все сущности
 для создания сущность в postman выбираем Body/raw/JSON так же меняем запрос на POST
{
"name":"Apple Store",
"city":"Бишкек",
"street":"ул.Абдырахманова",
"house_number":410
}
