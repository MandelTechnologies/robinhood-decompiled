package com.robinhood.android.options.history.detail.extensions;

import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnderlyingTypes.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a$\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, m3636d2 = {"getUnderlyingId", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiOptionChain;", "getInstrumentDetailKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingId", "accountNumber", "", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "feature-options-history-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.history.detail.extensions.UnderlyingTypesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UnderlyingTypes {

    /* compiled from: UnderlyingTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.history.detail.extensions.UnderlyingTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UUID getUnderlyingId(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "<this>");
        OptionUnderlying optionUnderlying = (OptionUnderlying) CollectionsKt.singleOrNull((List) uiOptionChain.getUnderlyings());
        if (optionUnderlying != null) {
            return optionUnderlying.getUnderlyingId();
        }
        return null;
    }

    public static final FragmentKey getInstrumentDetailKey(OptionChain.UnderlyingType underlyingType, UUID underlyingId, String accountNumber, InstrumentDetailSource source) {
        Intrinsics.checkNotNullParameter(underlyingType, "<this>");
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(source, "source");
        int i = WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
        if (i == 1) {
            return new LegacyFragmentKey.EquityInstrumentDetail(underlyingId, null, accountNumber, source, false, 18, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new IndexDetailPageFragmentKey(underlyingId, accountNumber, IndexDetailPageFragmentKey2.OptionOrderDetail.INSTANCE);
    }
}
