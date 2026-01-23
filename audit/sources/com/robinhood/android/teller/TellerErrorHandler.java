package com.robinhood.android.teller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.enums.moshi.RhEnumJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import com.stripe.android.core.exception.StripeException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: TellerErrorHandler.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/teller/TellerErrorHandler;", "T", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "activity", "Landroid/app/Activity;", "forceAsDialog", "", "errorDialogId", "", "errorDialogThemeOverride", "<init>", "(Landroid/app/Activity;ZILjava/lang/Integer;)V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "moshi$delegate", "Lkotlin/Lazy;", "handleError", "t", "", "handleNonNetworkError", "handleAndThrowUnhandled", "", "Companion", "lib-teller_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TellerErrorHandler<T> extends ActivityErrorHandler<T> {
    public static final String PRIMARY_BUTTON_ACTION_KEY = "primary_button_action";
    public static final String SECONDARY_BUTTON_ACTION_KEY = "secondary_button_action";

    /* renamed from: moshi$delegate, reason: from kotlin metadata */
    private final Lazy moshi;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Moshi moshi_delegate$lambda$1() {
        Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
        builderAdd.add((JsonAdapter.Factory) new KotlinJsonAdapter2());
        builderAdd.add((JsonAdapter.Factory) RhEnumJsonAdapterFactory.INSTANCE);
        Moshi moshiBuild = builderAdd.build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    public /* synthetic */ TellerErrorHandler(Activity activity, boolean z, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C11048R.id.dialog_id_generic_error : i, (i2 & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TellerErrorHandler(Activity activity, boolean z, int i, Integer num) {
        super(activity, z, i, num);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.moshi = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.teller.TellerErrorHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TellerErrorHandler.moshi_delegate$lambda$1();
            }
        });
    }

    private final Moshi getMoshi() {
        return (Moshi) this.moshi.getValue();
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    public boolean handleError(Throwable t, boolean handleNonNetworkError) {
        Intrinsics.checkNotNullParameter(t, "t");
        Context context = getContextRef().get();
        Intrinsics.checkNotNull(context);
        BaseActivity baseActivityRequireBaseActivityBaseContext = Contexts7.requireBaseActivityBaseContext(context);
        if (t instanceof StripeException) {
            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(baseActivityRequireBaseActivityBaseContext).setId(C29296R.id.dialog_id_teller_error).setTitle(C29296R.string.link_debit_card_generic_error_title, new Object[0]).setMessage(C29296R.string.link_debit_card_generic_error_message, new Object[0]);
            FragmentManager supportFragmentManager = baseActivityRequireBaseActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, supportFragmentManager, "debitCardLinkingError", false, 4, null);
            return true;
        }
        try {
            JsonAdapter<T> jsonAdapterAdapter = getMoshi().adapter((Class) ApiTellerLinkingError.class);
            Response<?> response = ((HttpException) t).response();
            Intrinsics.checkNotNull(response);
            ResponseBody responseBodyErrorBody = response.errorBody();
            Intrinsics.checkNotNull(responseBodyErrorBody);
            T tFromJson = jsonAdapterAdapter.fromJson(responseBodyErrorBody.string());
            Intrinsics.checkNotNull(tFromJson);
            ApiTellerLinkingError apiTellerLinkingError = (ApiTellerLinkingError) tFromJson;
            RhDialogFragment.Builder builderCreate = RhDialogFragment.INSTANCE.create(baseActivityRequireBaseActivityBaseContext);
            builderCreate.setId(C29296R.id.dialog_id_teller_error);
            String display_error_title = apiTellerLinkingError.getDisplay_error_title();
            if (display_error_title.length() > 0) {
                builderCreate.setTitle(display_error_title);
            }
            String display_error_text = apiTellerLinkingError.getDisplay_error_text();
            if (display_error_text.length() > 0) {
                builderCreate.setMessage(display_error_text);
            }
            Bundle bundle = new Bundle();
            String display_error_button_title = apiTellerLinkingError.getDisplay_error_button_title();
            if (display_error_button_title.length() > 0) {
                builderCreate.setPositiveButton(display_error_button_title);
                bundle.putSerializable(PRIMARY_BUTTON_ACTION_KEY, apiTellerLinkingError.getPrimary_action());
            }
            String secondary_cta = apiTellerLinkingError.getSecondary_cta();
            if (secondary_cta != null && secondary_cta.length() != 0) {
                builderCreate.setNegativeButton(secondary_cta);
                TellerErrorAction secondary_action = apiTellerLinkingError.getSecondary_action();
                Intrinsics.checkNotNull(secondary_action);
                bundle.putSerializable(SECONDARY_BUTTON_ACTION_KEY, secondary_action);
            }
            builderCreate.setPassthroughArgs(bundle);
            FragmentManager supportFragmentManager2 = baseActivityRequireBaseActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(builderCreate, supportFragmentManager2, "tellerError", false, 4, null);
            return true;
        } catch (Exception unused) {
            return super.handleError(t, handleNonNetworkError);
        }
    }

    public final void handleAndThrowUnhandled(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!AbsErrorHandler.handleError$default(this, t, false, 2, null)) {
            throw t;
        }
    }
}
