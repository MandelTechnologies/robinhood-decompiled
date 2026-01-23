package com.robinhood.android.pathfinder.corepages.heroimage;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pathfinder.corepages.heroimage.HeroImageViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.HeroImageContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.HeroImageFragmentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
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

/* compiled from: HeroImageDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\r\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/HeroImageContext;", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/HeroImageContext;", "updateInquiry", "", "id", "", "inputUpdateSource", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;", "dismissError", "dismissError$feature_pathfinder_core_pages_externalDebug", "handleInputError", "", "throwable", "", "handleInputError$feature_pathfinder_core_pages_externalDebug", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class HeroImageDuxo extends BaseDuxo4<HeroImageViewState> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroImageDuxo(PathfinderStore pathfinderStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new HeroImageViewState.Loaded(((UserViewStatePageContext.HeroImage) ((HeroImageFragmentKey) INSTANCE.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext(), HeroImageViewState.Loaded.InputUpdateSource.NONE), duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeroImageContext getContext() {
        return ((UserViewStatePageContext.HeroImage) ((HeroImageFragmentKey) INSTANCE.getArgs(getSavedStateHandle())).getUserViewState().getTypeContext()).getContext();
    }

    /* compiled from: HeroImageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1", m3645f = "HeroImageDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1 */
    static final class C253171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ HeroImageViewState.Loaded.InputUpdateSource $inputUpdateSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253171(String str, HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource, Continuation<? super C253171> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$inputUpdateSource = inputUpdateSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HeroImageDuxo.this.new C253171(this.$id, this.$inputUpdateSource, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HeroImageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1$1", m3645f = "HeroImageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HeroImageViewState, Continuation<? super HeroImageViewState>, Object> {
            final /* synthetic */ HeroImageViewState.Loaded.InputUpdateSource $inputUpdateSource;
            int label;
            final /* synthetic */ HeroImageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HeroImageDuxo heroImageDuxo, HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = heroImageDuxo;
                this.$inputUpdateSource = inputUpdateSource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$inputUpdateSource, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HeroImageViewState heroImageViewState, Continuation<? super HeroImageViewState> continuation) {
                return ((AnonymousClass1) create(heroImageViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new HeroImageViewState.Loaded(this.this$0.getContext(), this.$inputUpdateSource);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253171 c253171;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HeroImageDuxo heroImageDuxo = HeroImageDuxo.this;
                heroImageDuxo.applyMutation(new AnonymousClass1(heroImageDuxo, this.$inputUpdateSource, null));
                PathfinderStore pathfinderStore = HeroImageDuxo.this.pathfinderStore;
                Companion companion = HeroImageDuxo.INSTANCE;
                UUID inquiryId = ((HeroImageFragmentKey) companion.getArgs((HasSavedState) HeroImageDuxo.this)).getInquiryId();
                int sequence = ((HeroImageFragmentKey) companion.getArgs((HasSavedState) HeroImageDuxo.this)).getUserViewState().getSequence();
                UserViewInput.HeroImagePageInput heroImagePageInput = new UserViewInput.HeroImagePageInput(this.$id);
                HeroImageDuxo4 heroImageDuxo4 = new HeroImageDuxo4(HeroImageDuxo.this);
                this.label = 1;
                c253171 = this;
                obj = pathfinderStore.handleUserInput(inquiryId, sequence, heroImagePageInput, heroImageDuxo4, c253171);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253171 = this;
            }
            if (((UserViewState) obj) != null) {
                HeroImageDuxo heroImageDuxo2 = HeroImageDuxo.this;
                heroImageDuxo2.applyMutation(new AnonymousClass2(heroImageDuxo2, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HeroImageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1$2", m3645f = "HeroImageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<HeroImageViewState, Continuation<? super HeroImageViewState>, Object> {
            int label;
            final /* synthetic */ HeroImageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HeroImageDuxo heroImageDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = heroImageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HeroImageViewState heroImageViewState, Continuation<? super HeroImageViewState> continuation) {
                return ((AnonymousClass2) create(heroImageViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new HeroImageViewState.Loaded(this.this$0.getContext(), HeroImageViewState.Loaded.InputUpdateSource.NONE);
            }
        }
    }

    public final void updateInquiry(String id, HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(inputUpdateSource, "inputUpdateSource");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253171(id, inputUpdateSource, null), 3, null);
    }

    public final void dismissError$feature_pathfinder_core_pages_externalDebug() {
        applyMutation(new HeroImageDuxo2(this, null));
    }

    public final boolean handleInputError$feature_pathfinder_core_pages_externalDebug(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(throwable);
        if (zIsNetworkRelated) {
            applyMutation(new HeroImageDuxo3(null));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: HeroImageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/HeroImageFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<HeroImageDuxo, HeroImageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public HeroImageFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (HeroImageFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public HeroImageFragmentKey getArgs(HeroImageDuxo heroImageDuxo) {
            return (HeroImageFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, heroImageDuxo);
        }
    }
}
