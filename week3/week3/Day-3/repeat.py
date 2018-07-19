def find_repeat(the_list):
    a=1
    b=len(the_list)-1
    while a<b:
        midpoint=a+((b-a)/2)
        lower_a, lower_b=a,midpoint
        upper_a,upper_b= midpoint+1,b
        c=0
        for i in the_list:
            if i>=lower_a and i<=lower_b:
                c+= 1
        d=(lower_b-lower_a+1)
        if c>d:
            
            a,b=lower_a,lower_b
        else:
            
            a,b=upper_a,upper_b

    
    return a