package com.robinhood.prefs;

import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BooleanPrefState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/prefs/BooleanPreference;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "lib-prefs_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.prefs.BooleanPrefStateKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class BooleanPrefState {
    public static final StateFlow2<Boolean> toPrefState(BooleanPreference booleanPreference, LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<this>");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        StateFlow2<Boolean> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.valueOf(booleanPreference.get()));
        BuildersKt__Builders_commonKt.launch$default(logoutKillswitch.getLoggedInScope(), null, null, new C361151(stateFlow2MutableStateFlow, booleanPreference, null), 3, null);
        return stateFlow2MutableStateFlow;
    }

    /* compiled from: BooleanPrefState.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.BooleanPrefStateKt$toPrefState$1", m3645f = "BooleanPrefState.kt", m3646l = {18}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.BooleanPrefStateKt$toPrefState$1 */
    static final class C361151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateFlow2<Boolean> $prefState;
        final /* synthetic */ BooleanPreference $this_toPrefState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361151(StateFlow2<Boolean> stateFlow2, BooleanPreference booleanPreference, Continuation<? super C361151> continuation) {
            super(2, continuation);
            this.$prefState = stateFlow2;
            this.$this_toPrefState = booleanPreference;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361151(this.$prefState, this.$this_toPrefState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(this.$prefState, 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_toPrefState, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BooleanPrefState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.prefs.BooleanPrefStateKt$toPrefState$1$1", m3645f = "BooleanPrefState.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.prefs.BooleanPrefStateKt$toPrefState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final /* synthetic */ BooleanPreference $this_toPrefState;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BooleanPreference booleanPreference, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_toPrefState = booleanPreference;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_toPrefState, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$this_toPrefState.set(this.Z$0);
                return Unit.INSTANCE;
            }
        }
    }
}
