package com.stripe.android.stripe3ds2.views;

import com.robinhood.android.common.util.TransitionReason;
import com.stripe.android.stripe3ds2.R$drawable;
import com.stripe.android.stripe3ds2.R$string;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Brand.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB1\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/Brand;", "", "directoryServerName", "", "drawableResId", "", "nameResId", "shouldStretch", "", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V", "getDirectoryServerName$3ds2sdk_release", "()Ljava/lang/String;", "getDrawableResId$3ds2sdk_release", "()I", "getNameResId$3ds2sdk_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldStretch$3ds2sdk_release", "()Z", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "UnionPay", "Unknown", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Brand {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Brand[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String directoryServerName;
    private final int drawableResId;
    private final Integer nameResId;
    private final boolean shouldStretch;
    public static final Brand Visa = new Brand("Visa", 0, "visa", R$drawable.stripe_3ds2_ic_visa, Integer.valueOf(R$string.stripe_3ds2_brand_visa), false, 8, null);
    public static final Brand Mastercard = new Brand("Mastercard", 1, "mastercard", R$drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(R$string.stripe_3ds2_brand_mastercard), false, 8, null);
    public static final Brand Amex = new Brand("Amex", 2, "american_express", R$drawable.stripe_3ds2_ic_amex, Integer.valueOf(R$string.stripe_3ds2_brand_amex), false, 8, null);
    public static final Brand Discover = new Brand("Discover", 3, TransitionReason.OPTION_TRADE_DISCOVER, R$drawable.stripe_3ds2_ic_discover, Integer.valueOf(R$string.stripe_3ds2_brand_discover), false, 8, null);
    public static final Brand CartesBancaires = new Brand("CartesBancaires", 4, "cartes_bancaires", R$drawable.stripe_3ds2_ic_cartesbancaires, Integer.valueOf(R$string.stripe_3ds2_brand_cartesbancaires), true);
    public static final Brand UnionPay = new Brand("UnionPay", 5, "unionpay", R$drawable.stripe_3ds2_ic_unionpay, Integer.valueOf(R$string.stripe_3ds2_brand_unionpay), false, 8, null);
    public static final Brand Unknown = new Brand("Unknown", 6, "unknown", R$drawable.stripe_3ds2_ic_unknown, null, false, 8, null);

    private static final /* synthetic */ Brand[] $values() {
        return new Brand[]{Visa, Mastercard, Amex, Discover, CartesBancaires, UnionPay, Unknown};
    }

    public static EnumEntries<Brand> getEntries() {
        return $ENTRIES;
    }

    public static Brand valueOf(String str) {
        return (Brand) Enum.valueOf(Brand.class, str);
    }

    public static Brand[] values() {
        return (Brand[]) $VALUES.clone();
    }

    private Brand(String str, int i, String str2, int i2, Integer num, boolean z) {
        this.directoryServerName = str2;
        this.drawableResId = i2;
        this.nameResId = num;
        this.shouldStretch = z;
    }

    /* synthetic */ Brand(String str, int i, String str2, int i2, Integer num, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i2, num, (i3 & 8) != 0 ? false : z);
    }

    /* renamed from: getDirectoryServerName$3ds2sdk_release, reason: from getter */
    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    /* renamed from: getDrawableResId$3ds2sdk_release, reason: from getter */
    public final int getDrawableResId() {
        return this.drawableResId;
    }

    /* renamed from: getNameResId$3ds2sdk_release, reason: from getter */
    public final Integer getNameResId() {
        return this.nameResId;
    }

    /* renamed from: getShouldStretch$3ds2sdk_release, reason: from getter */
    public final boolean getShouldStretch() {
        return this.shouldStretch;
    }

    static {
        Brand[] brandArr$values = $values();
        $VALUES = brandArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brandArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Brand.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/Brand$Companion;", "", "()V", "lookup", "Lcom/stripe/android/stripe3ds2/views/Brand;", "directoryServerName", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "lookup$3ds2sdk_release", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Brand lookup$3ds2sdk_release(String directoryServerName, ErrorReporter errorReporter) {
            Brand next;
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Iterator<Brand> it = Brand.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.equals(next.getDirectoryServerName(), StringsKt.trim(directoryServerName).toString(), true)) {
                    break;
                }
            }
            Brand brand = next;
            if (brand != null) {
                objM28550constructorimpl = Result.m28550constructorimpl(brand);
            } else {
                EnumEntries<Brand> entries = Brand.getEntries();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
                Iterator<Brand> it2 = entries.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getDirectoryServerName());
                }
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(new SDKRuntimeException("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + ".", null, 2, null)));
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                errorReporter.reportError(thM28553exceptionOrNullimpl);
            }
            Brand brand2 = Brand.Unknown;
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = brand2;
            }
            return (Brand) objM28550constructorimpl;
        }
    }
}
