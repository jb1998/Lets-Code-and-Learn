from datetime import datetime
now = datetime.now()

print 'Current Date and Time is : %02d/%02d/%04d %02d:%02d:%02d' % (now.month,now.day,now.year,now.hour, now.minute, now.second)
print 'Date= %02d'%(now.day)
print 'month= %02d'%(now.month)
print 'Year= %02d'%(now.year)
print 'Hour= %02d'%(now.hour)
print 'Minutes= %02d'%(now.minute)
print 'Seconds= %02d'%(now.second)
