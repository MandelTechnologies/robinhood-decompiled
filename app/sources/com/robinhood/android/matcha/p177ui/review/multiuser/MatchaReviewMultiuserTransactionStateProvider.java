package com.robinhood.android.matcha.p177ui.review.multiuser;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewMultiuserTransactionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionViewState;", "<init>", "()V", "reduce", "dataState", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaReviewMultiuserTransactionStateProvider implements StateProvider<MatchaReviewMultiuserTransactionDataState, MatchaReviewMultiuserTransactionViewState> {
    public static final int $stable = 0;

    /* compiled from: MatchaReviewMultiuserTransactionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaReviewMultiuserTransactionViewState reduce(MatchaReviewMultiuserTransactionDataState dataState) {
        StringResource summary;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID transferId = dataState.getTransferId();
        if (dataState.getSummaryFirstTimeSuffix() != null) {
            summary = StringResources6.join(CollectionsKt.listOfNotNull((Object[]) new StringResource[]{dataState.getSummary(), dataState.getSummaryFirstTimeSuffix()}), "\n\n");
        } else {
            summary = dataState.getSummary();
        }
        StringResource stringResource = summary;
        Direction direction = dataState.getDirection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[direction.ordinal()];
        if (i == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21284R.string.matcha_swipe_up_pay_hint, new Object[0]);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21284R.string.matcha_swipe_up_request_hint, new Object[0]);
        }
        int i2 = iArr[dataState.getDirection().ordinal()];
        if (i2 == 1) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_pay, new Object[0]);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_request, new Object[0]);
        }
        return new MatchaReviewMultiuserTransactionViewState(transferId, stringResource, dataState.getAmountText(), stringResourceInvoke, stringResourceInvoke2, dataState.getToolbarSubtitle(), dataState.getAvatars(), dataState.getRequestId() != null, dataState.getMemoState(), dataState.getShowLoading());
    }
}
