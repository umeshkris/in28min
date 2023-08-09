insert into restapi.currency_exchange(id,conversion_multiple,environment,from_exchange,to_exchange) 
values(1001,45,'','AUS','INR')

insert into restapi.currency_exchange(id,conversion_multiple,environment,from_exchange,to_exchange) 
values(1002,55,'','CAD','INR')

insert into restapi.currency_exchange(id,conversion_multiple,environment,from_exchange,to_exchange) 
values(1003,60,'','FR','INR')

insert into restapi.currency_exchange(id,conversion_multiple,environment,from_exchange,to_exchange) 
values(1004,80,'','USD','INR')

insert into restapi.currency_exchange(id,conversion_multiple,environment,from_exchange,to_exchange) 
values(1005,90,'','EUR','INR')



select * From  restapi.currency_exchange

select * From  restapi.currency_exchange where from_exchange='USD'
 and to_exchange='INR'
 
 
insert into `currency-exchange`(id,conversion_multiple,environment,from_exchange,to_exchange) 
values(1,80,'8000','USD','INR')
