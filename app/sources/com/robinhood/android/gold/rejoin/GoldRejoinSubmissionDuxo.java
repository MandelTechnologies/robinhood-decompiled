package com.robinhood.android.gold.rejoin;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinRequest;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinResponse;
import com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionEvent;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.models.api.bonfire.ApiGoldSignedAgreement;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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

/* compiled from: GoldRejoinSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionViewState;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "goldRejoinStore", "Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "toOutcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinResponse;", "Companion", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldRejoinSubmissionDuxo extends BaseDuxo5<GoldRejoinSubmissionViewState, GoldRejoinSubmissionEvent> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final GoldRejoinStore goldRejoinStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GoldRejoinSubmissionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoldRejoinResponse.Status.values().length];
            try {
                iArr[GoldRejoinResponse.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoldRejoinResponse.Status.SWEEP_ENROLLMENT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoldRejoinResponse.Status.GOLD_REJOIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoldRejoinResponse.Status.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldRejoinSubmissionDuxo(AgreementsStore agreementsStore, GoldRejoinStore goldRejoinStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(GoldRejoinSubmissionViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(goldRejoinStore, "goldRejoinStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.agreementsStore = agreementsStore;
        this.goldRejoinStore = goldRejoinStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldRejoinSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionDuxo$onCreate$1", m3645f = "GoldRejoinSubmissionDuxo.kt", m3646l = {43, 61}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionDuxo$onCreate$1 */
    static final class C178631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C178631(Continuation<? super C178631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C178631 c178631 = GoldRejoinSubmissionDuxo.this.new C178631(continuation);
            c178631.L$0 = obj;
            return c178631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C178631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x014d, code lost:
        
            if (r14 != r0) goto L51;
         */
        /* JADX WARN: Path cross not found for [B:27:0x0074, B:22:0x005c], limit reached: 55 */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:51:0x0150, B:42:0x00d6, B:44:0x00dc, B:30:0x0099, B:32:0x009f, B:41:0x00cc, B:46:0x0112, B:48:0x0116, B:45:0x0111, B:18:0x0046, B:20:0x0056, B:22:0x005c, B:24:0x006a, B:29:0x0082, B:27:0x0074), top: B:56:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:51:0x0150, B:42:0x00d6, B:44:0x00dc, B:30:0x0099, B:32:0x009f, B:41:0x00cc, B:46:0x0112, B:48:0x0116, B:45:0x0111, B:18:0x0046, B:20:0x0056, B:22:0x005c, B:24:0x006a, B:29:0x0082, B:27:0x0074), top: B:56:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:51:0x0150, B:42:0x00d6, B:44:0x00dc, B:30:0x0099, B:32:0x009f, B:41:0x00cc, B:46:0x0112, B:48:0x0116, B:45:0x0111, B:18:0x0046, B:20:0x0056, B:22:0x005c, B:24:0x006a, B:29:0x0082, B:27:0x0074), top: B:56:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0111 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:51:0x0150, B:42:0x00d6, B:44:0x00dc, B:30:0x0099, B:32:0x009f, B:41:0x00cc, B:46:0x0112, B:48:0x0116, B:45:0x0111, B:18:0x0046, B:20:0x0056, B:22:0x005c, B:24:0x006a, B:29:0x0082, B:27:0x0074), top: B:56:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0112 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:51:0x0150, B:42:0x00d6, B:44:0x00dc, B:30:0x0099, B:32:0x009f, B:41:0x00cc, B:46:0x0112, B:48:0x0116, B:45:0x0111, B:18:0x0046, B:20:0x0056, B:22:0x005c, B:24:0x006a, B:29:0x0082, B:27:0x0074), top: B:56:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c2 -> B:37:0x00c3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<String> signedAgreementTypes;
            List list;
            CoroutineScope coroutineScope;
            GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo;
            Collection arrayList;
            Iterator it;
            String agreementType;
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                GoldRejoinSubmissionDuxo.this.applyMutation(new AnonymousClass1(th, null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                Companion companion = GoldRejoinSubmissionDuxo.INSTANCE;
                ApiGoldPaymentInstrument backupPaymentInstrument = ((GoldRejoinSubmissionFragment.Args) companion.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getBackupPaymentInstrument();
                if (backupPaymentInstrument != null && (agreementType = backupPaymentInstrument.getAgreementType()) != null) {
                    List<String> signedAgreementTypes2 = ((GoldRejoinSubmissionFragment.Args) companion.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getSignedAgreementTypes();
                    signedAgreementTypes = signedAgreementTypes2 != null ? CollectionsKt.plus((Collection<? extends String>) signedAgreementTypes2, agreementType) : null;
                    if (signedAgreementTypes == null) {
                    }
                    if (signedAgreementTypes != null) {
                        list = null;
                        GoldRejoinStore goldRejoinStore = GoldRejoinSubmissionDuxo.this.goldRejoinStore;
                        Companion companion2 = GoldRejoinSubmissionDuxo.INSTANCE;
                        GoldRejoinRequest goldRejoinRequest = new GoldRejoinRequest(((GoldRejoinSubmissionFragment.Args) companion2.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getEnableSweep(), list, ((GoldRejoinSubmissionFragment.Args) companion2.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getBackupPaymentInstrument());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        obj = goldRejoinStore.rejoin(goldRejoinRequest, this);
                    } else {
                        List<String> list2 = signedAgreementTypes;
                        coroutineScope = coroutineScope2;
                        goldRejoinSubmissionDuxo = GoldRejoinSubmissionDuxo.this;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        it = list2.iterator();
                        if (!it.hasNext()) {
                        }
                    }
                }
                signedAgreementTypes = ((GoldRejoinSubmissionFragment.Args) companion.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getSignedAgreementTypes();
                if (signedAgreementTypes != null) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    GoldRejoinSubmissionDuxo.this.submit(new GoldRejoinSubmissionEvent.Loaded(GoldRejoinSubmissionDuxo.this.toOutcome((GoldRejoinResponse) obj)));
                    return Unit.INSTANCE;
                }
                arrayList = (Collection) this.L$5;
                String str = (String) this.L$4;
                it = (Iterator) this.L$3;
                Collection collection = (Collection) this.L$2;
                goldRejoinSubmissionDuxo = (GoldRejoinSubmissionDuxo) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
                }
                objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) obj);
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    UiAgreementWithContent uiAgreementWithContent = (UiAgreementWithContent) objM28550constructorimpl;
                    String string2 = uiAgreementWithContent.getApiAgreement().getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    arrayList.add(new ApiGoldSignedAgreement(string2, str, uiAgreementWithContent.getSha256(), ((GoldRejoinSubmissionFragment.Args) GoldRejoinSubmissionDuxo.INSTANCE.getArgs((HasSavedState) goldRejoinSubmissionDuxo)).getLoggingContext().getGold_upgrade_type().toString()));
                    arrayList = collection;
                    if (!it.hasNext()) {
                        str = (String) it.next();
                        try {
                        } catch (Throwable th3) {
                            collection = arrayList;
                            Result.Companion companion4 = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th3));
                        }
                        Result.Companion companion5 = Result.INSTANCE;
                        AgreementsStore agreementsStore = goldRejoinSubmissionDuxo.agreementsStore;
                        this.L$0 = coroutineScope;
                        this.L$1 = goldRejoinSubmissionDuxo;
                        this.L$2 = arrayList;
                        this.L$3 = it;
                        this.L$4 = str;
                        this.L$5 = arrayList;
                        this.label = 1;
                        obj = agreementsStore.getAgreementWithContent(str, this);
                        if (obj != coroutine_suspended) {
                            collection = arrayList;
                            objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) obj);
                            Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl2 != null) {
                                throw thM28553exceptionOrNullimpl2;
                            }
                        }
                        return coroutine_suspended;
                    }
                    list = (List) arrayList;
                    GoldRejoinStore goldRejoinStore2 = GoldRejoinSubmissionDuxo.this.goldRejoinStore;
                    Companion companion22 = GoldRejoinSubmissionDuxo.INSTANCE;
                    GoldRejoinRequest goldRejoinRequest2 = new GoldRejoinRequest(((GoldRejoinSubmissionFragment.Args) companion22.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getEnableSweep(), list, ((GoldRejoinSubmissionFragment.Args) companion22.getArgs((HasSavedState) GoldRejoinSubmissionDuxo.this)).getBackupPaymentInstrument());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    obj = goldRejoinStore2.rejoin(goldRejoinRequest2, this);
                }
            }
        }

        /* compiled from: GoldRejoinSubmissionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionDuxo$onCreate$1$1", m3645f = "GoldRejoinSubmissionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldRejoinSubmissionViewState, Continuation<? super GoldRejoinSubmissionViewState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f4174$t;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Throwable th, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.f4174$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.f4174$t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldRejoinSubmissionViewState goldRejoinSubmissionViewState, Continuation<? super GoldRejoinSubmissionViewState> continuation) {
                return ((AnonymousClass1) create(goldRejoinSubmissionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GoldRejoinSubmissionViewState.Failed(this.f4174$t);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C178631(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoldUpgradeOutcome toOutcome(GoldRejoinResponse goldRejoinResponse) {
        int i = WhenMappings.$EnumSwitchMapping$0[goldRejoinResponse.getStatus().ordinal()];
        if (i == 1) {
            return new GoldUpgradeOutcome.Complete(null, 1, null);
        }
        if (i == 2) {
            return new GoldUpgradeOutcome.Complete(goldRejoinResponse.getDisplayStatusMessage());
        }
        if (i == 3) {
            return new GoldUpgradeOutcome.Incomplete(StringResource.INSTANCE.invoke(goldRejoinResponse.getDisplayStatusMessage()));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new GoldUpgradeOutcome.Incomplete(StringResource.INSTANCE.invoke(C11048R.string.error_description_something_went_wrong, new Object[0]));
    }

    /* compiled from: GoldRejoinSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionDuxo;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Args;", "<init>", "()V", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldRejoinSubmissionDuxo, GoldRejoinSubmissionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldRejoinSubmissionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (GoldRejoinSubmissionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldRejoinSubmissionFragment.Args getArgs(GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo) {
            return (GoldRejoinSubmissionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, goldRejoinSubmissionDuxo);
        }
    }
}
