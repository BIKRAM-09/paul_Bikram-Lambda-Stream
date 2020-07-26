class ListSort{
public List<String> search(List<String> list){
    return list.stream()
       .filter(s->s.startswith("a"))
       .filter(s->s.length()==3)
       .collect(Collectors.toList());
    }
}