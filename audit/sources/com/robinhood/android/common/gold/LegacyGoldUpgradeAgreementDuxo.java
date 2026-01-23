package com.robinhood.android.common.gold;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.io.IOException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "goldUpgradeStore", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "stateProvider", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;Lcom/robinhood/android/common/gold/GoldUpgradeAgreementStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onReviewed", "onAccepted", "Companion", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LegacyGoldUpgradeAgreementDuxo extends BaseDuxo<GoldUpgradeAgreementDataState, LegacyGoldUpgradeAgreementViewState2> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final GoldUpgradeStore goldUpgradeStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGoldUpgradeAgreementDuxo(AgreementsStore agreementsStore, GoldUpgradeStore goldUpgradeStore, LegacyGoldUpgradeAgreementViewState stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new GoldUpgradeAgreementDataState(LegacyGoldUpgradeAgreementDataState2.UNREVIEWED, ((LegacyGoldUpgradeAgreementFragment.Args) INSTANCE.getArgs(savedStateHandle)).getGoldAgreement(), null, null, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.agreementsStore = agreementsStore;
        this.goldUpgradeStore = goldUpgradeStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_UPGRADE_DISCLOSURE_LOADING, true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C111781(null), 3, null);
    }

    /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1", m3645f = "LegacyGoldUpgradeAgreementDuxo.kt", m3646l = {44, 100}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1 */
    static final class C111781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C111781(Continuation<? super C111781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyGoldUpgradeAgreementDuxo.this.new C111781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C111781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[Catch: IOException -> 0x0017, TryCatch #0 {IOException -> 0x0017, blocks: (B:7:0x0013, B:30:0x006f, B:32:0x008c, B:13:0x0022, B:23:0x004e, B:26:0x0054, B:31:0x0082, B:16:0x0029, B:18:0x0039, B:20:0x003f), top: B:37:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: IOException -> 0x0017, TryCatch #0 {IOException -> 0x0017, blocks: (B:7:0x0013, B:30:0x006f, B:32:0x008c, B:13:0x0022, B:23:0x004e, B:26:0x0054, B:31:0x0082, B:16:0x0029, B:18:0x0039, B:20:0x003f), top: B:37:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiAgreementWithContent uiAgreementWithContent;
            String agreementType;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (IOException e) {
                LegacyGoldUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass3(e, null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApiGoldSweepAgreement goldAgreement = ((LegacyGoldUpgradeAgreementFragment.Args) LegacyGoldUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) LegacyGoldUpgradeAgreementDuxo.this)).getGoldAgreement();
                if (goldAgreement == null || (agreementType = goldAgreement.getAgreementType()) == null) {
                    uiAgreementWithContent = null;
                    if (uiAgreementWithContent != null) {
                        LegacyGoldUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass2(null));
                        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_UPGRADE_DISCLOSURE_LOADING, false);
                        return Unit.INSTANCE;
                    }
                    String content = uiAgreementWithContent.getContent();
                    Observable<Optional<UUID>> observableStreamSelectedPlanId = LegacyGoldUpgradeAgreementDuxo.this.goldUpgradeStore.streamSelectedPlanId();
                    this.L$0 = content;
                    this.label = 2;
                    Object objAwaitFirst = RxAwait3.awaitFirst(observableStreamSelectedPlanId, this);
                    if (objAwaitFirst != coroutine_suspended) {
                        str = content;
                        obj = objAwaitFirst;
                        LegacyGoldUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass1(str, (UUID) ((Optional) obj).getOrNull(), null));
                        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_UPGRADE_DISCLOSURE_LOADING, false);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                AgreementsStore agreementsStore = LegacyGoldUpgradeAgreementDuxo.this.agreementsStore;
                this.label = 1;
                obj = agreementsStore.getAgreementWithContent(agreementType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    LegacyGoldUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass1(str, (UUID) ((Optional) obj).getOrNull(), null));
                    IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_UPGRADE_DISCLOSURE_LOADING, false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            uiAgreementWithContent = (UiAgreementWithContent) obj;
            if (uiAgreementWithContent != null) {
            }
        }

        /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1$1", m3645f = "LegacyGoldUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState>, Object> {
            final /* synthetic */ String $disclosureMarkdown;
            final /* synthetic */ UUID $selectedPlanId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$disclosureMarkdown = str;
                this.$selectedPlanId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosureMarkdown, this.$selectedPlanId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass1) create(goldUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                LegacyGoldUpgradeAgreementDataState2 loadedStatus;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GoldUpgradeAgreementDataState goldUpgradeAgreementDataState = (GoldUpgradeAgreementDataState) this.L$0;
                if (goldUpgradeAgreementDataState.getLoadedStatus() == LegacyGoldUpgradeAgreementDataState2.ACCEPTED) {
                    loadedStatus = LegacyGoldUpgradeAgreementDataState2.UNREVIEWED;
                } else {
                    loadedStatus = goldUpgradeAgreementDataState.getLoadedStatus();
                }
                return GoldUpgradeAgreementDataState.copy$default(goldUpgradeAgreementDataState, loadedStatus, null, this.$disclosureMarkdown, null, this.$selectedPlanId, 10, null);
            }
        }

        /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1$2", m3645f = "LegacyGoldUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass2) create(goldUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return GoldUpgradeAgreementDataState.copy$default((GoldUpgradeAgreementDataState) this.L$0, null, null, null, null, null, 29, null);
            }
        }

        /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1$3", m3645f = "LegacyGoldUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<GoldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState>, Object> {
            final /* synthetic */ IOException $error;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(IOException iOException, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$error = iOException;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$error, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass3) create(goldUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return GoldUpgradeAgreementDataState.copy$default((GoldUpgradeAgreementDataState) this.L$0, null, null, null, this.$error, null, 23, null);
            }
        }
    }

    /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onReviewed$1", m3645f = "LegacyGoldUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onReviewed$1 */
    static final class C111771 extends ContinuationImpl7 implements Function2<GoldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C111771(Continuation<? super C111771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111771 c111771 = new C111771(continuation);
            c111771.L$0 = obj;
            return c111771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState> continuation) {
            return ((C111771) create(goldUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return GoldUpgradeAgreementDataState.copy$default((GoldUpgradeAgreementDataState) this.L$0, LegacyGoldUpgradeAgreementDataState2.REVIEWED, null, null, null, null, 30, null);
        }
    }

    public final void onReviewed() {
        applyMutation(new C111771(null));
    }

    /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onAccepted$1", m3645f = "LegacyGoldUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementDuxo$onAccepted$1 */
    static final class C111761 extends ContinuationImpl7 implements Function2<GoldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C111761(Continuation<? super C111761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111761 c111761 = new C111761(continuation);
            c111761.L$0 = obj;
            return c111761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState, Continuation<? super GoldUpgradeAgreementDataState> continuation) {
            return ((C111761) create(goldUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return GoldUpgradeAgreementDataState.copy$default((GoldUpgradeAgreementDataState) this.L$0, LegacyGoldUpgradeAgreementDataState2.ACCEPTED, null, null, null, null, 30, null);
        }
    }

    public final void onAccepted() {
        applyMutation(new C111761(null));
    }

    /* compiled from: LegacyGoldUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementDuxo;", "Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementFragment$Args;", "<init>", "()V", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LegacyGoldUpgradeAgreementDuxo, LegacyGoldUpgradeAgreementFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyGoldUpgradeAgreementFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyGoldUpgradeAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyGoldUpgradeAgreementFragment.Args getArgs(LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo) {
            return (LegacyGoldUpgradeAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeAgreementDuxo);
        }
    }
}
