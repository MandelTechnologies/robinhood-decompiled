package com.robinhood.android.gold.rejoin;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlow;
import com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore;
import com.robinhood.android.gold.rejoin.GoldRejoinLoadingEvent;
import com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment;
import com.robinhood.android.gold.rejoin.GoldRejoinLoadingViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldRejoinLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingViewState;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "goldRejoinStore", "Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldRejoinLoadingDuxo extends BaseDuxo5<GoldRejoinLoadingViewState, GoldRejoinLoadingEvent> implements HasSavedState {
    private final GoldRejoinStore goldRejoinStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldRejoinLoadingDuxo(GoldRejoinStore goldRejoinStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(GoldRejoinLoadingViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldRejoinStore, "goldRejoinStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldRejoinStore = goldRejoinStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldRejoinLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.rejoin.GoldRejoinLoadingDuxo$onCreate$1", m3645f = "GoldRejoinLoadingDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinLoadingDuxo$onCreate$1 */
    static final class C178501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C178501(Continuation<? super C178501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldRejoinLoadingDuxo.this.new C178501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C178501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldRejoinStore goldRejoinStore = GoldRejoinLoadingDuxo.this.goldRejoinStore;
                    Companion companion = GoldRejoinLoadingDuxo.INSTANCE;
                    String source = ((GoldRejoinLoadingFragment.Args) companion.getArgs((HasSavedState) GoldRejoinLoadingDuxo.this)).getSource();
                    String feature = ((GoldRejoinLoadingFragment.Args) companion.getArgs((HasSavedState) GoldRejoinLoadingDuxo.this)).getFeature();
                    this.label = 1;
                    obj = goldRejoinStore.getGoldRejoinFlow(source, feature, true, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GoldRejoinLoadingDuxo.this.submit(new GoldRejoinLoadingEvent.Loaded((ApiGoldRejoinFlow) obj));
            } catch (Exception e) {
                GoldRejoinLoadingDuxo.this.submit(new GoldRejoinLoadingEvent.Failed(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C178501(null), 3, null);
    }

    /* compiled from: GoldRejoinLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingDuxo;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Args;", "<init>", "()V", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldRejoinLoadingDuxo, GoldRejoinLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldRejoinLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (GoldRejoinLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldRejoinLoadingFragment.Args getArgs(GoldRejoinLoadingDuxo goldRejoinLoadingDuxo) {
            return (GoldRejoinLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, goldRejoinLoadingDuxo);
        }
    }
}
