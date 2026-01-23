package com.truelayer.payments.p419ui.utils;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.utils.extensions.ResourceTypes;
import com.truelayer.payments.p419ui.models.Country;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlagIconUtils.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/FlagIconUtils;", "", "()V", "getFlagResource", "", "context", "Landroid/content/Context;", PlaceTypes.COUNTRY, "Lcom/truelayer/payments/ui/models/Country;", "(Landroid/content/Context;Lcom/truelayer/payments/ui/models/Country;)Ljava/lang/Integer;", "getFlagUri", "", "countryCode", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FlagIconUtils {
    public static final int $stable = 0;
    public static final FlagIconUtils INSTANCE = new FlagIconUtils();

    private FlagIconUtils() {
    }

    public final Integer getFlagResource(Context context, Country country) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(country, "country");
        Resources resources = context.getResources();
        String lowerCase = country.getCountryCode().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int identifier = resources.getIdentifier("flag_square_" + lowerCase, ResourceTypes.DRAWABLE, context.getPackageName());
        if (identifier != 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }

    public final String getFlagUri(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String lowerCase = countryCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return "https://payment.truelayer.com/assets/country/" + lowerCase + ".png";
    }
}
