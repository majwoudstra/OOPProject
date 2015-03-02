
public class Matchroster extends Wedstrijd {


@SuppressWarnings("static-access")
public void playmatch( Division i){
	
	int round = i.GetRound()%17;
	
	
	
	
	
	switch (round){
		
		case 1:
			
			playmatch(i.get(1), i.get(2), i);
			playmatch(i.get(3), i.get(4), i);
			playmatch(i.get(5), i.get(6), i);
			playmatch(i.get(7), i.get(8), i);
			playmatch(i.get(9), i.get(10), i);
			playmatch(i.get(11), i.get(12), i);
			playmatch(i.get(13), i.get(14), i);
			playmatch(i.get(15), i.get(16), i);
			playmatch(i.get(17), i.get(18), i);
			
			i.SetRound(i.GetRound()+1);
			break;
		
		case 2:
			
			playmatch(i.get(1), i.get(3), i);
			playmatch(i.get(2), i.get(5), i);
			playmatch(i.get(4), i.get(7), i);
			playmatch(i.get(6), i.get(9), i);
			playmatch(i.get(8), i.get(11), i);
			playmatch(i.get(10), i.get(13), i);
			playmatch(i.get(12), i.get(15), i);
			playmatch(i.get(14), i.get(17), i);
			playmatch(i.get(16), i.get(18), i);
			
			i.SetRound(i.GetRound()+1);
			break;
	
		case 3:
			
			playmatch(i.get(1), i.get(4), i);
			playmatch(i.get(3), i.get(6), i);
			playmatch(i.get(5), i.get(8), i);
			playmatch(i.get(7), i.get(10), i);
			playmatch(i.get(9), i.get(12), i);
			playmatch(i.get(11), i.get(14), i);
			playmatch(i.get(13), i.get(16), i);
			playmatch(i.get(15), i.get(18), i);
			playmatch(i.get(17), i.get(2), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 4:
			
			playmatch(i.get(1), i.get(5), i);
			playmatch(i.get(2), i.get(7), i);
			playmatch(i.get(4), i.get(9), i);
			playmatch(i.get(6), i.get(11), i);
			playmatch(i.get(8), i.get(13), i);
			playmatch(i.get(10), i.get(15), i);
			playmatch(i.get(12), i.get(17), i);
			playmatch(i.get(14), i.get(18), i);
			playmatch(i.get(16), i.get(3), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 5:
			
			playmatch(i.get(1), i.get(6), i);
			playmatch(i.get(3), i.get(8), i);
			playmatch(i.get(5), i.get(10), i);
			playmatch(i.get(7), i.get(12), i);
			playmatch(i.get(9), i.get(14), i);
			playmatch(i.get(11), i.get(16), i);
			playmatch(i.get(13), i.get(18), i);
			playmatch(i.get(15), i.get(2), i);
			playmatch(i.get(17), i.get(4), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 6:
			
			playmatch(i.get(1), i.get(7), i);
			playmatch(i.get(2), i.get(9), i);
			playmatch(i.get(4), i.get(11), i);
			playmatch(i.get(6), i.get(13), i);
			playmatch(i.get(8), i.get(15), i);
			playmatch(i.get(10), i.get(17), i);
			playmatch(i.get(12), i.get(18), i);
			playmatch(i.get(14), i.get(3), i);
			playmatch(i.get(16), i.get(5), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 7:
			
			playmatch(i.get(1), i.get(8), i);
			playmatch(i.get(3), i.get(10), i);
			playmatch(i.get(5), i.get(12), i);
			playmatch(i.get(7), i.get(14), i);
			playmatch(i.get(9), i.get(16), i);
			playmatch(i.get(11), i.get(18), i);
			playmatch(i.get(13), i.get(2), i);
			playmatch(i.get(15), i.get(4), i);
			playmatch(i.get(17), i.get(6), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 8:
			
			playmatch(i.get(1), i.get(9), i);
			playmatch(i.get(2), i.get(11), i);
			playmatch(i.get(4), i.get(13), i);
			playmatch(i.get(6), i.get(15), i);
			playmatch(i.get(8), i.get(17), i);
			playmatch(i.get(10), i.get(18), i);
			playmatch(i.get(12), i.get(3), i);
			playmatch(i.get(14), i.get(5), i);
			playmatch(i.get(16), i.get(7), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 9:
			
			playmatch(i.get(1), i.get(10), i);
			playmatch(i.get(3), i.get(12), i);
			playmatch(i.get(5), i.get(14), i);
			playmatch(i.get(7), i.get(16), i);
			playmatch(i.get(9), i.get(18), i);
			playmatch(i.get(11), i.get(2), i);
			playmatch(i.get(13), i.get(4), i);
			playmatch(i.get(15), i.get(6), i);
			playmatch(i.get(17), i.get(8), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 10:
			
			playmatch(i.get(1), i.get(11), i);
			playmatch(i.get(2), i.get(13), i);
			playmatch(i.get(4), i.get(15), i);
			playmatch(i.get(6), i.get(17), i);
			playmatch(i.get(8), i.get(18), i);
			playmatch(i.get(10), i.get(3), i);
			playmatch(i.get(12), i.get(5), i);
			playmatch(i.get(14), i.get(7), i);
			playmatch(i.get(16), i.get(9), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 11:
			
			playmatch(i.get(1), i.get(12), i);
			playmatch(i.get(3), i.get(14), i);
			playmatch(i.get(5), i.get(16), i);
			playmatch(i.get(7), i.get(18), i);
			playmatch(i.get(9), i.get(2), i);
			playmatch(i.get(11), i.get(4), i);
			playmatch(i.get(13), i.get(6), i);
			playmatch(i.get(15), i.get(8), i);
			playmatch(i.get(17), i.get(10), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 12:
			
			playmatch(i.get(1), i.get(13), i);
			playmatch(i.get(2), i.get(15), i);
			playmatch(i.get(4), i.get(17), i);
			playmatch(i.get(6), i.get(18), i);
			playmatch(i.get(8), i.get(3), i);
			playmatch(i.get(10), i.get(5), i);
			playmatch(i.get(12), i.get(7), i);
			playmatch(i.get(14), i.get(9), i);
			playmatch(i.get(16), i.get(11), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 13:
			
			playmatch(i.get(1), i.get(14), i);
			playmatch(i.get(3), i.get(16), i);
			playmatch(i.get(5), i.get(18), i);
			playmatch(i.get(7), i.get(2), i);
			playmatch(i.get(9), i.get(4), i);
			playmatch(i.get(11), i.get(6), i);
			playmatch(i.get(13), i.get(8), i);
			playmatch(i.get(15), i.get(10), i);
			playmatch(i.get(17), i.get(12), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 14:
			
			playmatch(i.get(1), i.get(15), i);
			playmatch(i.get(2), i.get(17), i);
			playmatch(i.get(4), i.get(18), i);
			playmatch(i.get(6), i.get(3), i);
			playmatch(i.get(8), i.get(5), i);
			playmatch(i.get(10), i.get(7), i);
			playmatch(i.get(12), i.get(9), i);
			playmatch(i.get(14), i.get(11), i);
			playmatch(i.get(16), i.get(13), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 15:
			
			playmatch(i.get(1), i.get(16), i);
			playmatch(i.get(3), i.get(18), i);
			playmatch(i.get(5), i.get(2), i);
			playmatch(i.get(7), i.get(4), i);
			playmatch(i.get(9), i.get(6), i);
			playmatch(i.get(11), i.get(8), i);
			playmatch(i.get(13), i.get(10), i);
			playmatch(i.get(15), i.get(12), i);
			playmatch(i.get(17), i.get(14), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 16:
			
			playmatch(i.get(1), i.get(17), i);
			playmatch(i.get(2), i.get(18), i);
			playmatch(i.get(4), i.get(3), i);
			playmatch(i.get(6), i.get(5), i);
			playmatch(i.get(8), i.get(7), i);
			playmatch(i.get(10), i.get(9), i);
			playmatch(i.get(12), i.get(11), i);
			playmatch(i.get(14), i.get(13), i);
			playmatch(i.get(16), i.get(15), i);
			
			i.SetRound(i.GetRound()+1);
			break;
			
		case 17:
			
			playmatch(i.get(1), i.get(18), i);
			playmatch(i.get(3), i.get(2), i);
			playmatch(i.get(5), i.get(4), i);
			playmatch(i.get(7), i.get(6), i);
			playmatch(i.get(9), i.get(8), i);
			playmatch(i.get(11), i.get(10), i);
			playmatch(i.get(13), i.get(12), i);
			playmatch(i.get(15), i.get(14), i);
			playmatch(i.get(17), i.get(16), i);
			
			i.SetRound(i.GetRound()+1);
			break;
		
	}
	
}	
}
