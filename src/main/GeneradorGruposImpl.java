import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneradorGruposImpl implements GeneradorGrupos{

    @Override
    public List<List<String>> generate(int groupSize, String... members) {
        
        List<String> membersList = new ArrayList<>(); 
        membersList = Arrays.asList(members);
        Collections.shuffle(membersList);

        List<List<String>> listaGrupos = new ArrayList<>();

        if(groupSize > membersList.size()){
            throw new IllegalArgumentException("El numero de miembros es inferior al tamaño de grupos");
        }

        int numeroGrupos = (int) Math.ceil((double) membersList.size() / groupSize);

        for (int i = 0; i < numeroGrupos; i++) {
            listaGrupos.add(new ArrayList<>());
        }
        
        for (int i = 0; i < membersList.size(); i++) {
            int grupo = i % numeroGrupos;
            listaGrupos.get(grupo).add(membersList.get(i));
        }
        return listaGrupos;
    }

}
