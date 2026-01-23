package com.robinhood.shared.stepupverification.challenge;

import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeCodeInputUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeCodeInputUtils;", "", "<init>", "()V", "handleSubmitCodeError", "", "throwable", "", "showDialog", "Lkotlin/Function2;", "Lcom/robinhood/utils/resource/StringResource;", "", "onChallengeFailed", "Lkotlin/Function0;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeCodeInputUtils {
    public static final int $stable = 0;
    public static final ChallengeCodeInputUtils INSTANCE = new ChallengeCodeInputUtils();

    /* compiled from: ChallengeCodeInputUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Status.values().length];
            try {
                iArr[Challenge.Status.ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Status.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Challenge.Status.VALIDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Challenge.Status.REDEEMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ChallengeCodeInputUtils() {
    }

    public final boolean handleSubmitCodeError(Throwable throwable, Function2<? super StringResource, ? super StringResource, Unit> showDialog, Function0<Unit> onChallengeFailed) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(showDialog, "showDialog");
        Intrinsics.checkNotNullParameter(onChallengeFailed, "onChallengeFailed");
        Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
        if (httpStatusCode == null || httpStatusCode.intValue() != 400) {
            return false;
        }
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (!(errorResponseExtractErrorResponse instanceof ChallengeErrorResponse)) {
            return false;
        }
        ChallengeErrorResponse challengeErrorResponse = (ChallengeErrorResponse) errorResponseExtractErrorResponse;
        int i = WhenMappings.$EnumSwitchMapping$0[challengeErrorResponse.getChallenge().getStatus().ordinal()];
        if (i == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            showDialog.invoke(companion.invoke(C39076R.string.challenge_verification_dialog_wrong_code_title, new Object[0]), companion.invoke(C39076R.string.challenge_verification_dialog_wrong_code_msg, new Object[0]));
        } else {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(challengeErrorResponse.getChallenge().getStatus());
                throw new ExceptionsH();
            }
            onChallengeFailed.invoke();
        }
        return true;
    }
}
