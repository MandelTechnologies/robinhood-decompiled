package com.robinhood.android.rhymigration.p245ui.intro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyFeatureDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyFeatureDisclosureDuxo extends OldBaseDuxo<RhyFeatureDisclosureState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyFeatureDisclosureDuxo(StaticContentStore staticContentStore, SavedStateHandle savedStateHandle) {
        super(new RhyFeatureDisclosureState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C276231(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyFeatureDisclosureDuxo.onStart$lambda$1(this.f$0, (Disclosure) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyFeatureDisclosureDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RhyFeatureDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureDuxo$onStart$1", m3645f = "RhyFeatureDisclosureDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureDuxo$onStart$1 */
    static final class C276231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Disclosure>, Object> {
        int label;

        C276231(Continuation<? super C276231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyFeatureDisclosureDuxo.this.new C276231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Disclosure> continuation) {
            return ((C276231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RhyFeatureDisclosureDuxo.this.staticContentStore;
                ResourceLink resourceLink = (ResourceLink) RhyFeatureDisclosureDuxo.INSTANCE.getExtras((HasSavedState) RhyFeatureDisclosureDuxo.this);
                this.label = 1;
                obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((EntryResource) obj).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyFeatureDisclosureDuxo rhyFeatureDisclosureDuxo, final Disclosure disclosure) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        rhyFeatureDisclosureDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyFeatureDisclosureDuxo.onStart$lambda$1$lambda$0(disclosure, (RhyFeatureDisclosureState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyFeatureDisclosureState onStart$lambda$1$lambda$0(Disclosure disclosure, RhyFeatureDisclosureState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyFeatureDisclosureState.copy$default(applyMutation, disclosure, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyFeatureDisclosureDuxo rhyFeatureDisclosureDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyFeatureDisclosureDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyFeatureDisclosureDuxo.onStart$lambda$3$lambda$2(throwable, (RhyFeatureDisclosureState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyFeatureDisclosureState onStart$lambda$3$lambda$2(Throwable th, RhyFeatureDisclosureState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyFeatureDisclosureState.copy$default(applyMutation, null, new UiEvent(th), 1, null);
    }

    /* compiled from: RhyFeatureDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureDuxo;", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<RhyFeatureDisclosureDuxo, ResourceLink<EntryResource<Disclosure>>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public ResourceLink<EntryResource<Disclosure>> getExtras(SavedStateHandle savedStateHandle) {
            return (ResourceLink) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public ResourceLink<EntryResource<Disclosure>> getExtras(RhyFeatureDisclosureDuxo rhyFeatureDisclosureDuxo) {
            return (ResourceLink) DuxoCompanion2.DefaultImpls.getExtras(this, rhyFeatureDisclosureDuxo);
        }
    }
}
