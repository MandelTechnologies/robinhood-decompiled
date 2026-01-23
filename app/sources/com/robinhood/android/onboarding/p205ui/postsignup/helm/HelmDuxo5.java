package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import com.robinhood.android.helm.HelmCallback;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.onboarding.contracts.HelmIntentKey;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.android.onboarding.p205ui.postsignup.helm.HelmDuxoEvent;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.models.p355ui.identi.UiApplication;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelmDuxo.kt */
@Metadata(m3635d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, m3636d2 = {"com/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo$helmCallback$1", "Lcom/robinhood/android/helm/HelmCallback;", "startNativeSubFlow", "", "flowId", "", "subFlowId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopLoadingSubFlow", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endFlow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchUi", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$helmCallback$1, reason: use source file name */
/* loaded from: classes10.dex */
public final class HelmDuxo5 implements HelmCallback {
    final /* synthetic */ HelmDuxo this$0;

    /* compiled from: HelmDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$helmCallback$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HelmSubFlow.values().length];
            try {
                iArr[HelmSubFlow.INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HelmSubFlow.BANK_LINKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HelmSubFlow.GB_QUEUED_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HelmSubFlow.NATIVE_FUNDING_UPSELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HelmSubFlow.FIRST_DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HelmSubFlow.GB_VERIFY_IDENTITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HelmSubFlow.RECURRING_DEPOSIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HelmSubFlow.DOC_UPLOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HelmSubFlow.POST_FUNDING_UPSELL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HelmSubFlow.REFERRAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HelmSubFlow.THANK_YOU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HelmSubFlow.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    HelmDuxo5(HelmDuxo helmDuxo) {
        this.this$0 = helmDuxo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.helm.HelmCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startNativeSubFlow(String str, String str2, Continuation<? super Boolean> continuation) {
        HelmDuxo6 helmDuxo6;
        PostSignUpDestination preFundSplash;
        if (continuation instanceof HelmDuxo6) {
            helmDuxo6 = (HelmDuxo6) continuation;
            int i = helmDuxo6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                helmDuxo6.label = i - Integer.MIN_VALUE;
            } else {
                helmDuxo6 = new HelmDuxo6(this, continuation);
            }
        }
        Object documentsToUpload = helmDuxo6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = helmDuxo6.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(documentsToUpload);
            switch (WhenMappings.$EnumSwitchMapping$0[HelmSubFlow.INSTANCE.fromId(str2).ordinal()]) {
                case 1:
                    preFundSplash = new PostSignUpDestination.PreFundSplash(false);
                    break;
                case 2:
                    if (this.this$0.getStateFlow().getValue().getHasCompletedBankLinking()) {
                        preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
                        break;
                    } else {
                        preFundSplash = PostSignUpDestination.CreateIavRelationship.INSTANCE;
                        break;
                    }
                case 3:
                    preFundSplash = PostSignUpDestination.CreateUkQueuedDeposit.INSTANCE;
                    break;
                case 4:
                    preFundSplash = PostSignUpDestination.NativeFundingUpsell.INSTANCE;
                    break;
                case 5:
                    if (this.this$0.getStateFlow().getValue().getHasCompletedBankLinking()) {
                        preFundSplash = PostSignUpDestination.FirstDeposit.INSTANCE;
                        break;
                    } else {
                        preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
                        break;
                    }
                case 6:
                    preFundSplash = PostSignUpDestination.VerifyIdentity.INSTANCE;
                    break;
                case 7:
                    HelmState value = this.this$0.getStateFlow().getValue();
                    if (((HelmIntentKey) HelmDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getIsRhy() || value.getCompletedDepositAmount() == null || !value.getHasCompletedBankLinking()) {
                        preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
                        break;
                    } else {
                        preFundSplash = new PostSignUpDestination.RecurringAutomaticDeposit(value.getCompletedDepositAmount());
                        break;
                    }
                case 8:
                    HelmDuxo helmDuxo = this.this$0;
                    helmDuxo6.L$0 = str;
                    helmDuxo6.label = 1;
                    documentsToUpload = helmDuxo.getDocumentsToUpload(helmDuxo6);
                    break;
                case 9:
                    if (((HelmIntentKey) HelmDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getIsRhy()) {
                        preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
                        break;
                    } else {
                        preFundSplash = PostSignUpDestination.PostFundingUpsell.INSTANCE;
                        break;
                    }
                case 10:
                    UserApplicationStore userApplicationStore = this.this$0.userApplicationStore;
                    helmDuxo6.L$0 = str;
                    helmDuxo6.label = 2;
                    documentsToUpload = userApplicationStore.coGetApplication(helmDuxo6);
                    break;
                case 11:
                    preFundSplash = new PostSignUpDestination.Thanks(false);
                    break;
                case 12:
                    preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 1) {
            str = (String) helmDuxo6.L$0;
            ResultKt.throwOnFailure(documentsToUpload);
            List list = (List) documentsToUpload;
            if (list.isEmpty()) {
                preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
            } else {
                preFundSplash = new PostSignUpDestination.DocUpload(list);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) helmDuxo6.L$0;
            ResultKt.throwOnFailure(documentsToUpload);
            UiApplication uiApplication = (UiApplication) documentsToUpload;
            if (uiApplication != null && uiApplication.isApproved() && !((HelmIntentKey) HelmDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getIsRhy()) {
                preFundSplash = PostSignUpDestination.Referral.INSTANCE;
            } else {
                preFundSplash = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
            }
        }
        this.this$0.applyMutation(new HelmDuxo7(str, null));
        HelmDuxo helmDuxo2 = this.this$0;
        helmDuxo2.logPostSignUpNavigation(helmDuxo2.analytics, null, preFundSplash);
        this.this$0.submit(new HelmDuxoEvent.ProcessDestination(preFundSplash));
        return boxing.boxBoolean(!Intrinsics.areEqual(preFundSplash, PostSignUpDestination.HelmDrivenSubFlow.INSTANCE));
    }

    @Override // com.robinhood.android.helm.HelmCallback
    public Object stopLoadingSubFlow(String str, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.helm.HelmCallback
    public Object endFlow(Continuation<? super Unit> continuation) {
        this.this$0.cardManager.invalidateCardsBestEffort();
        this.this$0.sortingHatStore.invalidateSortingHatCacheIfNeeded();
        this.this$0.submit(new HelmDuxoEvent.EndFlow(((HelmIntentKey) HelmDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getIsRhy()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.helm.HelmCallback
    public void launchUi(FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        this.this$0.submit(new HelmDuxoEvent.LaunchUi(fragmentKey));
    }
}
