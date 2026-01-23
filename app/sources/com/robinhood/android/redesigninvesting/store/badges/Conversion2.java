package com.robinhood.android.redesigninvesting.store.badges;

import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Conversion.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toAssetType", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "lib-store-badges_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.store.badges.ConversionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Conversion2 {

    /* compiled from: Conversion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.ConversionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentType.INDEX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InstrumentType.FUTURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InstrumentType.OPTION_STRATEGY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApiAssetType toAssetType(InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(instrumentType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return ApiAssetType.CRYPTO;
            case 4:
                return ApiAssetType.EQUITY;
            case 5:
                return ApiAssetType.INDEX;
            case 6:
                return ApiAssetType.UNKNOWN;
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
