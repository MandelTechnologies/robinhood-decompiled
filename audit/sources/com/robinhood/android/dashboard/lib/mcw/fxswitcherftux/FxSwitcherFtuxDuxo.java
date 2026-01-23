package com.robinhood.android.dashboard.lib.mcw.fxswitcherftux;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxState;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxSwitcherFtuxDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Data;", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Event;", "hasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;)V", "getHasSeenFxSwitcherFtuxPref", "()Lcom/robinhood/prefs/BooleanPreference;", "onContinue", "", "closeFtux", "updateHasSeenFxSwitcherFtuxPref", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FxSwitcherFtuxDuxo extends BaseDuxo5<FxSwitcherFtuxState.Data, FxSwitcherFtuxState.Event> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final BooleanPreference hasSeenFxSwitcherFtuxPref;

    public final BooleanPreference getHasSeenFxSwitcherFtuxPref() {
        return this.hasSeenFxSwitcherFtuxPref;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxSwitcherFtuxDuxo(@DisplayCurrencySelectionPrefs2 BooleanPreference hasSeenFxSwitcherFtuxPref, EventLogger eventLogger, DuxoBundle duxoBundle) {
        super(new FxSwitcherFtuxState.Data(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.hasSeenFxSwitcherFtuxPref = hasSeenFxSwitcherFtuxPref;
        this.eventLogger = eventLogger;
    }

    public final void onContinue() {
        FxSwitcherFtuxState.Step next = getStateFlow().getValue().getCurrentStep().getNext();
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.FX_SWITCHER_FTUX, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, "fx_switcher_ftux_next_step", null, 4, null), null, new Context(getStateFlow().getValue().getCurrentStep().getStepNumber(), 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        if (next != null) {
            applyMutation(new C137631(next, null));
        }
        if (next == null || (next instanceof FxSwitcherFtuxState.Step.End)) {
            submit(FxSwitcherFtuxState.Event.Exit.INSTANCE);
        }
    }

    /* compiled from: FxSwitcherFtuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Data;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo$onContinue$1", m3645f = "FxSwitcherFtuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo$onContinue$1 */
    static final class C137631 extends ContinuationImpl7 implements Function2<FxSwitcherFtuxState.Data, Continuation<? super FxSwitcherFtuxState.Data>, Object> {
        final /* synthetic */ FxSwitcherFtuxState.Step $nextStep;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C137631(FxSwitcherFtuxState.Step step, Continuation<? super C137631> continuation) {
            super(2, continuation);
            this.$nextStep = step;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C137631 c137631 = new C137631(this.$nextStep, continuation);
            c137631.L$0 = obj;
            return c137631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FxSwitcherFtuxState.Data data, Continuation<? super FxSwitcherFtuxState.Data> continuation) {
            return ((C137631) create(data, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((FxSwitcherFtuxState.Data) this.L$0).copy(this.$nextStep);
        }
    }

    /* compiled from: FxSwitcherFtuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Data;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo$closeFtux$1", m3645f = "FxSwitcherFtuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo$closeFtux$1 */
    static final class C137621 extends ContinuationImpl7 implements Function2<FxSwitcherFtuxState.Data, Continuation<? super FxSwitcherFtuxState.Data>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C137621(Continuation<? super C137621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C137621 c137621 = new C137621(continuation);
            c137621.L$0 = obj;
            return c137621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FxSwitcherFtuxState.Data data, Continuation<? super FxSwitcherFtuxState.Data> continuation) {
            return ((C137621) create(data, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((FxSwitcherFtuxState.Data) this.L$0).copy(new FxSwitcherFtuxState.Step.End(0, 0.0f, null, 0, 15, null));
        }
    }

    public final void closeFtux() {
        applyMutation(new C137621(null));
        submit(FxSwitcherFtuxState.Event.Exit.INSTANCE);
    }

    public final void updateHasSeenFxSwitcherFtuxPref() {
        this.hasSeenFxSwitcherFtuxPref.set(true);
    }
}
