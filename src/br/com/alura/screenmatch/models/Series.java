package br.com.alura.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private boolean inActivity;
    private int minutesPerEpisodes;
    private int episodesPerSeason;

    public Series(String name, int release) {
        super(name, release);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isInActivity() {
        return inActivity;
    }

    public void setInActivity(boolean inActivity) {
        this.inActivity = inActivity;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisodes;
    }
}
