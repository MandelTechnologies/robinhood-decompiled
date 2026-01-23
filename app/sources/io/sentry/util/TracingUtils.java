package io.sentry.util;

import io.sentry.Baggage;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.PropagationContext;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;

/* loaded from: classes21.dex */
public final class TracingUtils {
    public static void startNewTrace(IHub iHub) {
        iHub.configureScope(new ScopeCallback() { // from class: io.sentry.util.TracingUtils$$ExternalSyntheticLambda1
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                iScope.withPropagationContext(new Scope.IWithPropagationContext() { // from class: io.sentry.util.TracingUtils$$ExternalSyntheticLambda2
                    @Override // io.sentry.Scope.IWithPropagationContext
                    public final void accept(PropagationContext propagationContext) {
                        iScope.setPropagationContext(new PropagationContext());
                    }
                });
            }
        });
    }

    public static PropagationContext maybeUpdateBaggage(final IScope iScope, final SentryOptions sentryOptions) {
        return iScope.withPropagationContext(new Scope.IWithPropagationContext() { // from class: io.sentry.util.TracingUtils$$ExternalSyntheticLambda0
            @Override // io.sentry.Scope.IWithPropagationContext
            public final void accept(PropagationContext propagationContext) {
                TracingUtils.$r8$lambda$2H6nVgnRSxWbd94HOlyDS_2u3_0(sentryOptions, iScope, propagationContext);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$2H6nVgnRSxWbd94HOlyDS_2u3_0(SentryOptions sentryOptions, IScope iScope, PropagationContext propagationContext) {
        Baggage baggage = propagationContext.getBaggage();
        if (baggage == null) {
            baggage = new Baggage(sentryOptions.getLogger());
            propagationContext.setBaggage(baggage);
        }
        if (baggage.isMutable()) {
            baggage.setValuesFromScope(iScope, sentryOptions);
            baggage.freeze();
        }
    }
}
