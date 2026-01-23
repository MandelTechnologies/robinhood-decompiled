package com.robinhood.android.lib.trade.validation;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DefaultValidatorFailure.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0000*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/DefaultValidatorFailure;", "InputT", "", "ResolverT", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "<init>", "()V", "theme", "", "getTheme", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "getPositiveAction", "getNegativeAction", "showAlert", "", "input", "(Lcom/robinhood/android/common/ui/BaseActivity;Ljava/lang/Object;)V", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class DefaultValidatorFailure<InputT, ResolverT> implements Validator.Failure<InputT, ResolverT> {
    public static final int $stable = 0;
    private final Integer theme;

    public abstract CharSequence getMessage(BaseActivity activity);

    public CharSequence getNegativeAction(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return null;
    }

    public CharSequence getPositiveAction(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return null;
    }

    public abstract CharSequence getTitle(BaseActivity activity);

    @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
    public Validator.Action<InputT> onNegativeResponse(ResolverT resolvert, Bundle bundle) {
        return Validator.Failure.DefaultImpls.onNegativeResponse(this, resolvert, bundle);
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
    public Validator.Action<InputT> onPositiveResponse(ResolverT resolvert, Bundle bundle) {
        return Validator.Failure.DefaultImpls.onPositiveResponse(this, resolvert, bundle);
    }

    public Integer getTheme() {
        return this.theme;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
    public void showAlert(BaseActivity activity, InputT input) {
        RhDialogFragment.Builder negativeButton;
        RhDialogFragment.Builder positiveButton;
        RhDialogFragment.Builder theme;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(input, "input");
        RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(activity).setId(C20649R.id.dialog_id_validation_failure);
        Integer theme2 = getTheme();
        if (theme2 != null && (theme = id.setTheme(theme2.intValue())) != null) {
            id = theme;
        }
        RhDialogFragment.Builder message = id.setTitle(getTitle(activity)).setMessage(getMessage(activity));
        CharSequence positiveAction = getPositiveAction(activity);
        if (positiveAction != null && (positiveButton = message.setPositiveButton(positiveAction)) != null) {
            message = positiveButton;
        }
        CharSequence negativeAction = getNegativeAction(activity);
        RhDialogFragment.Builder builder = (negativeAction == null || (negativeButton = message.setNegativeButton(negativeAction)) == null) ? message : negativeButton;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builder, supportFragmentManager, getClass().getSimpleName(), false, 4, null);
    }
}
