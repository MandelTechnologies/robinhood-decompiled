package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import com.robinhood.models.api.pathfinder.UserViewInput;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationInputOption.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0002¨\u0006\t"}, m3636d2 = {"toUserInput", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "isOnObfuscatedEmailPage", "", "toObfuscatedEmailV3Input", "Lcom/robinhood/models/api/pathfinder/UserViewInput$ObfuscatedEmailV3;", "toShowFullEmailV3Input", "Lcom/robinhood/models/api/pathfinder/UserViewInput$ShowFullEmailV3;", "feature-unverified-account-recovery_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationInputOptionKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class EmailConfirmationInputOption2 {

    /* compiled from: EmailConfirmationInputOption.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationInputOptionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailConfirmationInputOption.values().length];
            try {
                iArr[EmailConfirmationInputOption.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailConfirmationInputOption.SHOW_FULL_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmailConfirmationInputOption.UPDATE_EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UserViewInput toUserInput(EmailConfirmationInputOption emailConfirmationInputOption, boolean z) {
        Intrinsics.checkNotNullParameter(emailConfirmationInputOption, "<this>");
        if (z) {
            return toObfuscatedEmailV3Input(emailConfirmationInputOption);
        }
        return toShowFullEmailV3Input(emailConfirmationInputOption);
    }

    private static final UserViewInput.ObfuscatedEmailV3 toObfuscatedEmailV3Input(EmailConfirmationInputOption emailConfirmationInputOption) {
        int i = WhenMappings.$EnumSwitchMapping$0[emailConfirmationInputOption.ordinal()];
        if (i == 1) {
            return new UserViewInput.ObfuscatedEmailV3(null, null, "log_in");
        }
        if (i == 2) {
            return new UserViewInput.ObfuscatedEmailV3(Boolean.TRUE, null, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new UserViewInput.ObfuscatedEmailV3(null, Boolean.TRUE, null);
    }

    private static final UserViewInput.ShowFullEmailV3 toShowFullEmailV3Input(EmailConfirmationInputOption emailConfirmationInputOption) {
        int i = WhenMappings.$EnumSwitchMapping$0[emailConfirmationInputOption.ordinal()];
        if (i == 1) {
            return new UserViewInput.ShowFullEmailV3(null, "log_in");
        }
        if (i == 2) {
            throw new IllegalStateException("This page does not support SHOW_FULL_EMAIL action");
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new UserViewInput.ShowFullEmailV3(Boolean.TRUE, null);
    }
}
