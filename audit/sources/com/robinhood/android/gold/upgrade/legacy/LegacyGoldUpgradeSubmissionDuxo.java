package com.robinhood.android.gold.upgrade.legacy;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.contracts.GoldUpgradeSubmissionFragmentContract;
import com.robinhood.android.gold.subscription.api.GoldSubscribeRequest;
import com.robinhood.android.gold.subscription.api.GoldSubscribeResponse;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSubmissionEvent;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSubmissionViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
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

/* compiled from: LegacyGoldUpgradeSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fBQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionViewState;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sending", "", "onStart", "", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeSubmissionDuxo extends BaseDuxo5<LegacyGoldUpgradeSubmissionViewState, LegacyGoldUpgradeSubmissionEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AgreementsStore agreementsStore;
    private final CardManager cardManager;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private final SavedStateHandle savedStateHandle;
    private boolean sending;
    private final BaseSortingHatStore sortingHatStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGoldUpgradeSubmissionDuxo(AgreementsStore agreementsStore, AccountProvider accountProvider, CardManager cardManager, BaseSortingHatStore sortingHatStore, GoldSubscriptionStore goldSubscriptionStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(LegacyGoldUpgradeSubmissionViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.agreementsStore = agreementsStore;
        this.accountProvider = accountProvider;
        this.cardManager = cardManager;
        this.sortingHatStore = sortingHatStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: LegacyGoldUpgradeSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSubmissionDuxo$onStart$1", m3645f = "LegacyGoldUpgradeSubmissionDuxo.kt", m3646l = {59, 78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSubmissionDuxo$onStart$1 */
    static final class C181141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* compiled from: LegacyGoldUpgradeSubmissionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSubmissionDuxo$onStart$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GoldSubscribeResponse.Status.values().length];
                try {
                    iArr[GoldSubscribeResponse.Status.MARGIN_UPGRADE_FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.MARGIN_UPGRADE_REJECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.MARGIN_UPGRADE_PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.MARGIN_INVESTING_ENABLE_FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.GOLD_UPGRADE_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.SWEEP_ENROLLMENT_FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.SLIP_ENABLE_FAILED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[GoldSubscribeResponse.Status.SUCCESS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C181141(Continuation<? super C181141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C181141 c181141 = LegacyGoldUpgradeSubmissionDuxo.this.new C181141(continuation);
            c181141.L$0 = obj;
            return c181141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x018c, code lost:
        
            if (r15 != r1) goto L55;
         */
        /* JADX WARN: Path cross not found for [B:31:0x008d, B:26:0x0075], limit reached: 69 */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: all -> 0x0015, TryCatch #2 {all -> 0x0015, blocks: (B:6:0x0010, B:55:0x018f, B:56:0x019d, B:57:0x01a0, B:58:0x01a5, B:59:0x01a6, B:63:0x01c7, B:60:0x01ac, B:62:0x01b7, B:46:0x00f0, B:48:0x00f6, B:34:0x00b2, B:36:0x00b8, B:45:0x00e6, B:50:0x012c, B:52:0x0131, B:49:0x012b, B:22:0x005f, B:24:0x006f, B:26:0x0075, B:28:0x0083, B:33:0x009b, B:31:0x008d), top: B:72:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #2 {all -> 0x0015, blocks: (B:6:0x0010, B:55:0x018f, B:56:0x019d, B:57:0x01a0, B:58:0x01a5, B:59:0x01a6, B:63:0x01c7, B:60:0x01ac, B:62:0x01b7, B:46:0x00f0, B:48:0x00f6, B:34:0x00b2, B:36:0x00b8, B:45:0x00e6, B:50:0x012c, B:52:0x0131, B:49:0x012b, B:22:0x005f, B:24:0x006f, B:26:0x0075, B:28:0x0083, B:33:0x009b, B:31:0x008d), top: B:72:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[Catch: all -> 0x0015, TryCatch #2 {all -> 0x0015, blocks: (B:6:0x0010, B:55:0x018f, B:56:0x019d, B:57:0x01a0, B:58:0x01a5, B:59:0x01a6, B:63:0x01c7, B:60:0x01ac, B:62:0x01b7, B:46:0x00f0, B:48:0x00f6, B:34:0x00b2, B:36:0x00b8, B:45:0x00e6, B:50:0x012c, B:52:0x0131, B:49:0x012b, B:22:0x005f, B:24:0x006f, B:26:0x0075, B:28:0x0083, B:33:0x009b, B:31:0x008d), top: B:72:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[Catch: all -> 0x0015, TryCatch #2 {all -> 0x0015, blocks: (B:6:0x0010, B:55:0x018f, B:56:0x019d, B:57:0x01a0, B:58:0x01a5, B:59:0x01a6, B:63:0x01c7, B:60:0x01ac, B:62:0x01b7, B:46:0x00f0, B:48:0x00f6, B:34:0x00b2, B:36:0x00b8, B:45:0x00e6, B:50:0x012c, B:52:0x0131, B:49:0x012b, B:22:0x005f, B:24:0x006f, B:26:0x0075, B:28:0x0083, B:33:0x009b, B:31:0x008d), top: B:72:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012c A[Catch: all -> 0x0015, TryCatch #2 {all -> 0x0015, blocks: (B:6:0x0010, B:55:0x018f, B:56:0x019d, B:57:0x01a0, B:58:0x01a5, B:59:0x01a6, B:63:0x01c7, B:60:0x01ac, B:62:0x01b7, B:46:0x00f0, B:48:0x00f6, B:34:0x00b2, B:36:0x00b8, B:45:0x00e6, B:50:0x012c, B:52:0x0131, B:49:0x012b, B:22:0x005f, B:24:0x006f, B:26:0x0075, B:28:0x0083, B:33:0x009b, B:31:0x008d), top: B:72:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00db -> B:41:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<String> signedAgreementTypes;
            List list;
            CoroutineScope coroutineScope;
            LegacyGoldUpgradeSubmissionDuxo legacyGoldUpgradeSubmissionDuxo;
            Iterator it;
            Collection collection;
            String agreementType;
            Object objM28550constructorimpl;
            GoldUpgradeOutcome incomplete;
            GoldUpgradeOutcome complete;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                LegacyGoldUpgradeSubmissionDuxo.this.sending = false;
                LegacyGoldUpgradeSubmissionDuxo.this.submit(new LegacyGoldUpgradeSubmissionEvent.Error(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                if (LegacyGoldUpgradeSubmissionDuxo.this.sending) {
                    return Unit.INSTANCE;
                }
                LegacyGoldUpgradeSubmissionDuxo.this.sending = true;
                Companion companion = LegacyGoldUpgradeSubmissionDuxo.INSTANCE;
                ApiGoldPaymentInstrument backupPaymentInstrument = ((GoldUpgradeSubmissionFragmentContract.Key) companion.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getBackupPaymentInstrument();
                if (backupPaymentInstrument != null && (agreementType = backupPaymentInstrument.getAgreementType()) != null) {
                    List<String> signedAgreementTypes2 = ((GoldUpgradeSubmissionFragmentContract.Key) companion.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getSignedAgreementTypes();
                    signedAgreementTypes = signedAgreementTypes2 != null ? CollectionsKt.plus((Collection<? extends String>) signedAgreementTypes2, agreementType) : null;
                    if (signedAgreementTypes == null) {
                    }
                    if (signedAgreementTypes != null) {
                        list = null;
                        GoldSubscriptionStore goldSubscriptionStore = LegacyGoldUpgradeSubmissionDuxo.this.goldSubscriptionStore;
                        Companion companion2 = LegacyGoldUpgradeSubmissionDuxo.INSTANCE;
                        GoldSubscribeRequest goldSubscribeRequest = new GoldSubscribeRequest(((GoldUpgradeSubmissionFragmentContract.Key) companion2.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getPlanId(), ((GoldUpgradeSubmissionFragmentContract.Key) companion2.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getEnableSweep(), ((GoldUpgradeSubmissionFragmentContract.Key) companion2.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getEnableSlip(), ((GoldUpgradeSubmissionFragmentContract.Key) companion2.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getPromotion(), list, ((GoldUpgradeSubmissionFragmentContract.Key) companion2.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getBackupPaymentInstrument());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        obj = goldSubscriptionStore.subscribe(goldSubscribeRequest, this);
                    } else {
                        List<String> list2 = signedAgreementTypes;
                        LegacyGoldUpgradeSubmissionDuxo legacyGoldUpgradeSubmissionDuxo2 = LegacyGoldUpgradeSubmissionDuxo.this;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        coroutineScope = coroutineScope2;
                        legacyGoldUpgradeSubmissionDuxo = legacyGoldUpgradeSubmissionDuxo2;
                        it = list2.iterator();
                        collection = arrayList;
                        if (!it.hasNext()) {
                        }
                    }
                }
                signedAgreementTypes = ((GoldUpgradeSubmissionFragmentContract.Key) companion.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getSignedAgreementTypes();
                if (signedAgreementTypes != null) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    GoldSubscribeResponse goldSubscribeResponse = (GoldSubscribeResponse) obj;
                    switch (WhenMappings.$EnumSwitchMapping$0[goldSubscribeResponse.getStatus().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            incomplete = new GoldUpgradeOutcome.Incomplete(StringResource.INSTANCE.invoke(goldSubscribeResponse.getDisplayStatusMessage()));
                            complete = incomplete;
                            LegacyGoldUpgradeSubmissionDuxo.this.accountProvider.refresh(true);
                            LegacyGoldUpgradeSubmissionDuxo.this.cardManager.invalidateCardsBestEffort();
                            LegacyGoldUpgradeSubmissionDuxo.this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
                            SweepEnrollmentStore.refreshSweepSplash$default(LegacyGoldUpgradeSubmissionDuxo.this.sweepEnrollmentStore, null, true, 1, null);
                            LegacyGoldUpgradeSubmissionDuxo.this.sweepsInterestStore.refreshNoAccountNumber(true);
                            LegacyGoldUpgradeSubmissionDuxo.this.sending = false;
                            LegacyGoldUpgradeSubmissionDuxo.this.submit(new LegacyGoldUpgradeSubmissionEvent.Loaded(complete));
                            return Unit.INSTANCE;
                        case 6:
                        case 7:
                            incomplete = new GoldUpgradeOutcome.Complete(goldSubscribeResponse.getDisplayStatusMessage());
                            complete = incomplete;
                            LegacyGoldUpgradeSubmissionDuxo.this.accountProvider.refresh(true);
                            LegacyGoldUpgradeSubmissionDuxo.this.cardManager.invalidateCardsBestEffort();
                            LegacyGoldUpgradeSubmissionDuxo.this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
                            SweepEnrollmentStore.refreshSweepSplash$default(LegacyGoldUpgradeSubmissionDuxo.this.sweepEnrollmentStore, null, true, 1, null);
                            LegacyGoldUpgradeSubmissionDuxo.this.sweepsInterestStore.refreshNoAccountNumber(true);
                            LegacyGoldUpgradeSubmissionDuxo.this.sending = false;
                            LegacyGoldUpgradeSubmissionDuxo.this.submit(new LegacyGoldUpgradeSubmissionEvent.Loaded(complete));
                            return Unit.INSTANCE;
                        case 8:
                            complete = new GoldUpgradeOutcome.Complete(null, 1, null);
                            LegacyGoldUpgradeSubmissionDuxo.this.accountProvider.refresh(true);
                            LegacyGoldUpgradeSubmissionDuxo.this.cardManager.invalidateCardsBestEffort();
                            LegacyGoldUpgradeSubmissionDuxo.this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
                            SweepEnrollmentStore.refreshSweepSplash$default(LegacyGoldUpgradeSubmissionDuxo.this.sweepEnrollmentStore, null, true, 1, null);
                            LegacyGoldUpgradeSubmissionDuxo.this.sweepsInterestStore.refreshNoAccountNumber(true);
                            LegacyGoldUpgradeSubmissionDuxo.this.sending = false;
                            LegacyGoldUpgradeSubmissionDuxo.this.submit(new LegacyGoldUpgradeSubmissionEvent.Loaded(complete));
                            return Unit.INSTANCE;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                collection = (Collection) this.L$5;
                String str = (String) this.L$4;
                it = (Iterator) this.L$3;
                Collection collection2 = (Collection) this.L$2;
                legacyGoldUpgradeSubmissionDuxo = (LegacyGoldUpgradeSubmissionDuxo) this.L$1;
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
                    collection.add(new ApiGoldSignedAgreement(string2, str, uiAgreementWithContent.getSha256(), ((GoldUpgradeSubmissionFragmentContract.Key) LegacyGoldUpgradeSubmissionDuxo.INSTANCE.getArgs((HasSavedState) legacyGoldUpgradeSubmissionDuxo)).getLoggingContext().getGold_upgrade_type().toString()));
                    collection = collection2;
                    if (!it.hasNext()) {
                        str = (String) it.next();
                        try {
                        } catch (Throwable th3) {
                            collection2 = collection;
                            Result.Companion companion4 = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th3));
                        }
                        Result.Companion companion5 = Result.INSTANCE;
                        AgreementsStore agreementsStore = legacyGoldUpgradeSubmissionDuxo.agreementsStore;
                        this.L$0 = coroutineScope;
                        this.L$1 = legacyGoldUpgradeSubmissionDuxo;
                        this.L$2 = collection;
                        this.L$3 = it;
                        this.L$4 = str;
                        this.L$5 = collection;
                        this.label = 1;
                        obj = agreementsStore.getAgreementWithContent(str, this);
                        if (obj != coroutine_suspended) {
                            collection2 = collection;
                            objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) obj);
                            Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl2 != null) {
                                throw thM28553exceptionOrNullimpl2;
                            }
                        }
                        return coroutine_suspended;
                    }
                    list = (List) collection;
                    GoldSubscriptionStore goldSubscriptionStore2 = LegacyGoldUpgradeSubmissionDuxo.this.goldSubscriptionStore;
                    Companion companion22 = LegacyGoldUpgradeSubmissionDuxo.INSTANCE;
                    GoldSubscribeRequest goldSubscribeRequest2 = new GoldSubscribeRequest(((GoldUpgradeSubmissionFragmentContract.Key) companion22.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getPlanId(), ((GoldUpgradeSubmissionFragmentContract.Key) companion22.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getEnableSweep(), ((GoldUpgradeSubmissionFragmentContract.Key) companion22.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getEnableSlip(), ((GoldUpgradeSubmissionFragmentContract.Key) companion22.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getPromotion(), list, ((GoldUpgradeSubmissionFragmentContract.Key) companion22.getArgs((HasSavedState) LegacyGoldUpgradeSubmissionDuxo.this)).getBackupPaymentInstrument());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    obj = goldSubscriptionStore2.subscribe(goldSubscribeRequest2, this);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C181141(null), 3, null);
    }

    /* compiled from: LegacyGoldUpgradeSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionDuxo;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract$Key;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LegacyGoldUpgradeSubmissionDuxo, GoldUpgradeSubmissionFragmentContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldUpgradeSubmissionFragmentContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (GoldUpgradeSubmissionFragmentContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldUpgradeSubmissionFragmentContract.Key getArgs(LegacyGoldUpgradeSubmissionDuxo legacyGoldUpgradeSubmissionDuxo) {
            return (GoldUpgradeSubmissionFragmentContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeSubmissionDuxo);
        }
    }
}
