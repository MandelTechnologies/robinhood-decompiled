package com.robinhood.shared.portfolio.lists.p391ui.extensions;

import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.rosetta.eventlogging.Asset;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListObjectTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"eventType", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "Lcom/robinhood/models/api/CuratedListObjectType;", "getEventType", "(Lcom/robinhood/models/api/CuratedListObjectType;)Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.extensions.CuratedListObjectTypesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListObjectTypes {

    /* compiled from: CuratedListObjectTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.extensions.CuratedListObjectTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CuratedListObjectType.values().length];
            try {
                iArr[CuratedListObjectType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CuratedListObjectType.CURRENCY_PAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CuratedListObjectType.FUTURES_CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CuratedListObjectType.INSTRUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CuratedListObjectType.OPTION_STRATEGY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CuratedListObjectType.INDEX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CuratedListObjectType.PERPETUALS_CONTRACT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CuratedListObjectType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Asset.AssetType getEventType(CuratedListObjectType curatedListObjectType) {
        Intrinsics.checkNotNullParameter(curatedListObjectType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[curatedListObjectType.ordinal()]) {
            case 1:
            case 2:
                return Asset.AssetType.CURRENCY_PAIR;
            case 3:
                return Asset.AssetType.FUTURES;
            case 4:
                return Asset.AssetType.INSTRUMENT;
            case 5:
                return Asset.AssetType.OPTIONS_CONTRACT;
            case 6:
                return Asset.AssetType.INDEXES;
            case 7:
                return Asset.AssetType.PERPETUAL_CONTRACT;
            case 8:
                return Asset.AssetType.ASSET_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
