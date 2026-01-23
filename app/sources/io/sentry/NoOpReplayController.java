package io.sentry;

/* loaded from: classes21.dex */
public final class NoOpReplayController implements ReplayController {
    private static final NoOpReplayController instance = new NoOpReplayController();

    @Override // io.sentry.ReplayController
    public void captureReplay(Boolean bool) {
    }

    @Override // io.sentry.ReplayController
    public void pause() {
    }

    @Override // io.sentry.ReplayController
    public void resume() {
    }

    @Override // io.sentry.ReplayController
    public void start() {
    }

    @Override // io.sentry.ReplayController
    public void stop() {
    }

    public static NoOpReplayController getInstance() {
        return instance;
    }

    private NoOpReplayController() {
    }
}
