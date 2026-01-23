package com.robinhood.rosetta.converters.engagement;

import com.robinhood.models.p320db.recentSearch.RecentSearch2;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentSearchItem.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"getSearchResultItemType", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.engagement.RecentSearchItemKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RecentSearchItem2 {

    /* compiled from: RecentSearchItem.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.engagement.RecentSearchItemKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecentSearch2.Type.values().length];
            try {
                iArr[RecentSearch2.Type.INSTRUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecentSearch2.Type.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecentSearch2.Type.FUTURES_CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecentSearch2.Type.FUTURES_PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RecentSearch2.Type.EVENT_CONTRACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RecentSearch2.Type.EDUCATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RecentSearch2.Type.DEEPLINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RecentSearch2.Type.CURATED_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RecentSearch2.Type.MARKET_INDEX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RecentSearch2.Type.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SearchResultItem.ContentType getSearchResultItemType(RecentSearch2 recentSearch2) {
        Intrinsics.checkNotNullParameter(recentSearch2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[recentSearch2.getType().ordinal()]) {
            case 1:
                return SearchResultItem.ContentType.INSTRUMENT;
            case 2:
                return SearchResultItem.ContentType.CRYPTO;
            case 3:
                return SearchResultItem.ContentType.ACTIVE_FUTURES;
            case 4:
                return SearchResultItem.ContentType.FUTURES_PRODUCTS;
            case 5:
                return SearchResultItem.ContentType.EVENT_CONTRACTS;
            case 6:
                return SearchResultItem.ContentType.EDUCATION;
            case 7:
                return SearchResultItem.ContentType.DEEPLINK;
            case 8:
                return SearchResultItem.ContentType.LIST;
            case 9:
                return SearchResultItem.ContentType.MARKET_INDEXES;
            case 10:
                return SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
