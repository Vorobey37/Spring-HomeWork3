package ru.gb.SpringHomeWork3.services;

import org.springframework.stereotype.Service;

import ru.gb.SpringHomeWork3.entity.Issue;
import ru.gb.SpringHomeWork3.entity.Reader;

import ru.gb.SpringHomeWork3.repository.IssueRepository;
import ru.gb.SpringHomeWork3.repository.ReaderRepository;

import java.util.List;

@Service
public class ReaderService {
    private final ReaderRepository readerRepository;
    private final IssueRepository issueRepository;

    public ReaderService(ReaderRepository readerRepository, IssueRepository issueRepository) {
        this.readerRepository = readerRepository;
        this.issueRepository = issueRepository;
    }

    public ReaderRepository getReaderRepository() {
        return readerRepository;
    }

    public List<Reader> getAllReaders(){
        return readerRepository.getReaderList();
    }

    public Reader getReaderById(long id){
        return readerRepository.findById(id);
    }

    public void addReader(Reader reader){
        readerRepository.addReader(reader);
    }

    public void deleteReader(long id){
        readerRepository.deleteReader(id);
    }

    public List<Issue> getAllIssues(){
        return issueRepository.getIssueList();
    }
}
