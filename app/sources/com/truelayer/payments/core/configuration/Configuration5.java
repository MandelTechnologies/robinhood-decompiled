package com.truelayer.payments.core.configuration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.truelayer.payments.core.domain.configuration.Environment;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: Configuration.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a \u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00052\u0006\u0010\t\u001a\u00020\nH\u0002\u001a \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, m3636d2 = {"getAppNameHeader", "", "context", "Landroid/content/Context;", "initPaymentsExperienceUri", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lokhttp3/HttpUrl;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "environment", "Lcom/truelayer/payments/core/domain/configuration/Environment;", "initPaymentsUri", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.configuration.ConfigurationKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Configuration5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Outcome<HttpUrl, IllegalArgumentException> initPaymentsUri(Environment environment) {
        String paymentServerApi = UtilsKt.getPaymentServerApi(environment);
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(paymentServerApi);
        if (httpUrl != null) {
            return new Ok(httpUrl);
        }
        return new Fail(new IllegalArgumentException("Invalid `payments api uri` (" + paymentServerApi + ")."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Outcome<HttpUrl, IllegalArgumentException> initPaymentsExperienceUri(Environment environment) {
        String paymentsExperienceServerApi = UtilsKt.getPaymentsExperienceServerApi(environment);
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(paymentsExperienceServerApi);
        if (httpUrl != null) {
            return new Ok(httpUrl);
        }
        return new Fail(new IllegalArgumentException("Invalid `payments api uri` (" + paymentsExperienceServerApi + ")."));
    }

    public static final String getAppNameHeader(Context context) {
        Object fail;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                str2 = context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)).versionName;
                Intrinsics.checkNotNull(str2);
            } else {
                str2 = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
                Intrinsics.checkNotNull(str2);
            }
            fail = new Ok(str2);
        } catch (Throwable th) {
            fail = new Fail(th);
        }
        if (fail instanceof Ok) {
            str = (String) ((Ok) fail).getValue();
        } else {
            if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "unknown";
        }
        return packageName + "/" + str;
    }
}
