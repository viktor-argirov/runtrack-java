### Definition
A fork bomb (also called rabbit virus or wabbit) is a program that damage a system by making it run out of memory. It works by duplicating itself infinitely until saturating the process table.
The fork bomb is a form of DoS (denial-of-service) attack.

![[Pasted image 20230516082341.png]]

Fork bomb code creates a copy of a program. Once the new instance is runing, the fork happens again. This process can happen indefinitely or unil it exhausts all available memory. It can be devastating for the computer.

### How to prevent ?

One way of preventing a fork bomb from severely affecting the entire system is to limit the maximum number of processes that a single user may own. Indeed, as a fork bomb's mode of operation is entirely encapsulated by creating new processes, fix a limit could be a solution. In Linux, it is really easy to do it.

An other method is to limit memory use per process. If a process needs more than the limit, the user can allow or deny the execution right away.

