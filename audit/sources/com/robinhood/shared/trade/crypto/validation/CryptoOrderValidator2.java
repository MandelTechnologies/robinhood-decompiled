package com.robinhood.shared.trade.crypto.validation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.trade.validation.DefaultValidatorFailure;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderValidator.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "Lcom/robinhood/android/lib/trade/validation/DefaultValidatorFailure;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "theme", "", "getTheme", "()Ljava/lang/Integer;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.validation.CryptoOrderValidationFailure, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class CryptoOrderValidator2 extends DefaultValidatorFailure<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final int theme;

    public CryptoOrderValidator2(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
        this.theme = C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome;
    }

    @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
    public Integer getTheme() {
        return Integer.valueOf(this.theme);
    }

    @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
    public void showAlert(BaseActivity activity, CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(input, "input");
        super.showAlert(activity, (BaseActivity) input);
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, input.getEventScreen(), new Component(Component.ComponentType.ALERT, getCheckIdentifier(), null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, input.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 9, null);
    }
}
