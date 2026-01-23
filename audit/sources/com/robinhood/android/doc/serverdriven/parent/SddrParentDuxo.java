package com.robinhood.android.doc.serverdriven.parent;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.doc.serverdriven.parent.SddrDestinationEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrParentFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SddrParentDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrParentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "startFlow", "onNextFlowEvent", "event", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrParentDuxo extends BaseDuxo5<Unit, SddrDestinationEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SddrParentDuxo(UserStore userStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void startFlow() {
        String errorMessage = ((SddrParentFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDestination().getContent().getErrorMessage();
        if (errorMessage == null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C142932(null), 3, null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException(errorMessage), false, null, 6, null);
            submit(SddrDestinationEvent.Error.INSTANCE);
        }
    }

    /* compiled from: SddrParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.parent.SddrParentDuxo$startFlow$2", m3645f = "SddrParentDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.serverdriven.parent.SddrParentDuxo$startFlow$2 */
    static final class C142932 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C142932(Continuation<? super C142932> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrParentDuxo.this.new C142932(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str2 = (String) CollectionsKt.first((List) ((SddrParentFragment.Args) SddrParentDuxo.INSTANCE.getArgs((HasSavedState) SddrParentDuxo.this)).getDestination().getContent().getAllowedUploadDocumentTypes());
                ObservableSource map = SddrParentDuxo.this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentDuxo$startFlow$2$userLocality$1
                    @Override // io.reactivex.functions.Function
                    public final CountryCode.Supported apply(User it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getOrigin().getLocality();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                this.L$0 = str2;
                this.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(map, this);
                if (objAwaitFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                obj = objAwaitFirst;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str3;
            }
            SddrParentDuxo.this.onNextFlowEvent(new SddrFlowEvent.Start(new SddrFlowState((CountryCode.Supported) obj, str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onNextFlowEvent(SddrFlowEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            SddrParentStateProvider sddrParentStateProvider = SddrParentStateProvider.INSTANCE;
            Companion companion = INSTANCE;
            submit(sddrParentStateProvider.reduce(event, ((SddrParentFragment.Args) companion.getArgs((HasSavedState) this)).getDestination().getContent(), ((SddrParentFragment.Args) companion.getArgs((HasSavedState) this)).getMockRequests()));
        } catch (SddrException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            submit(SddrDestinationEvent.Error.INSTANCE);
        }
    }

    /* compiled from: SddrParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrParentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrParentDuxo;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrParentFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SddrParentDuxo, SddrParentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrParentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SddrParentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrParentFragment.Args getArgs(SddrParentDuxo sddrParentDuxo) {
            return (SddrParentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, sddrParentDuxo);
        }
    }
}
