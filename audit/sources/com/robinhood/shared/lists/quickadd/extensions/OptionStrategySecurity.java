package com.robinhood.shared.lists.quickadd.extensions;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.models.api.ApiOptionStrategyInfo;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.OptionCuratedListQuickAddRequest;
import com.robinhood.models.p320db.AggregateOptionPositionLeg;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionStrategyLeg;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStrategySecurity.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0012B)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\t\u0010\u0019J\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;", "Lcom/robinhood/models/db/Security;", "quickAddRequest", "Lcom/robinhood/models/api/OptionCuratedListQuickAddRequest;", "strategyCode", "", "id", "Ljava/util/UUID;", "displayName", "<init>", "(Lcom/robinhood/models/api/OptionCuratedListQuickAddRequest;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "resources", "Landroid/content/res/Resources;", "uiOptionStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "(Landroid/content/res/Resources;Lcom/robinhood/models/ui/UiOptionStrategyInfo;)V", "uiAggregateOptionPosition", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "(Landroid/content/res/Resources;Lcom/robinhood/models/ui/UiAggregateOptionPosition;)V", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/ui/UiOptionChain;)V", "getQuickAddRequest", "()Lcom/robinhood/models/api/OptionCuratedListQuickAddRequest;", "getStrategyCode", "()Ljava/lang/String;", "getId", "()Ljava/util/UUID;", "getDisplayName", "curatedListObjectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getCuratedListObjectType$annotations", "()V", "getCuratedListObjectType", "()Lcom/robinhood/models/api/CuratedListObjectType;", "displaySymbol", "getDisplaySymbol", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class OptionStrategySecurity implements Security {
    public static final Parcelable.Creator<OptionStrategySecurity> CREATOR = new Creator();
    private final String displayName;
    private final String displaySymbol;
    private final UUID id;
    private final OptionCuratedListQuickAddRequest quickAddRequest;
    private final String strategyCode;

    /* compiled from: OptionStrategySecurity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionStrategySecurity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategySecurity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionStrategySecurity((OptionCuratedListQuickAddRequest) parcel.readParcelable(OptionStrategySecurity.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategySecurity[] newArray(int i) {
            return new OptionStrategySecurity[i];
        }
    }

    public static /* synthetic */ void getCuratedListObjectType$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.quickAddRequest, flags);
        dest.writeString(this.strategyCode);
        dest.writeSerializable(this.id);
        dest.writeString(this.displayName);
    }

    @Override // com.robinhood.models.p320db.Security
    public boolean getAllowPriceAlerts() {
        return Security.DefaultImpls.getAllowPriceAlerts(this);
    }

    public OptionStrategySecurity(OptionCuratedListQuickAddRequest quickAddRequest, String strategyCode, UUID id, String displayName) {
        Intrinsics.checkNotNullParameter(quickAddRequest, "quickAddRequest");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.quickAddRequest = quickAddRequest;
        this.strategyCode = strategyCode;
        this.id = id;
        this.displayName = displayName;
        this.displaySymbol = getDisplayName();
    }

    public final OptionCuratedListQuickAddRequest getQuickAddRequest() {
        return this.quickAddRequest;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    @Override // com.robinhood.models.p320db.Security
    public UUID getId() {
        return this.id;
    }

    @Override // com.robinhood.models.p320db.Security
    public String getDisplayName() {
        return this.displayName;
    }

    public OptionStrategySecurity(Resources resources, UiOptionStrategyInfo uiOptionStrategyInfo) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(uiOptionStrategyInfo, "uiOptionStrategyInfo");
        List<UiOptionStrategyLeg> legs = uiOptionStrategyInfo.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            OptionStrategyLeg leg = ((UiOptionStrategyLeg) it.next()).getLeg();
            arrayList.add(new ApiOptionStrategyInfo.Leg(leg.getOptionId(), leg.getRatioQuantity().intValue(), leg.getPositionType()));
        }
        OptionCuratedListQuickAddRequest optionCuratedListQuickAddRequest = new OptionCuratedListQuickAddRequest(arrayList, null, 2, null);
        String strategyCode = uiOptionStrategyInfo.getOptionStrategyInfo().getStrategyCode();
        UUID id = uiOptionStrategyInfo.getId();
        String symbol = uiOptionStrategyInfo.getOptionChain().getSymbol();
        this(optionCuratedListQuickAddRequest, strategyCode, id, uiOptionStrategyInfo.getLegs().size() == 1 ? UiOptionStrategyDisplays.getStrategyTitleV2(uiOptionStrategyInfo, resources, symbol).toString() : OptionExtensions2.getStrategyTitle(uiOptionStrategyInfo, resources, symbol, uiOptionStrategyInfo.getUnderlyingType()).toString());
    }

    public OptionStrategySecurity(Resources resources, UiAggregateOptionPosition uiAggregateOptionPosition) {
        String string2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(uiAggregateOptionPosition, "uiAggregateOptionPosition");
        List<AggregateOptionPositionLeg> legs = uiAggregateOptionPosition.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        for (AggregateOptionPositionLeg aggregateOptionPositionLeg : legs) {
            arrayList.add(new ApiOptionStrategyInfo.Leg(aggregateOptionPositionLeg.getOptionInstrumentId(), aggregateOptionPositionLeg.getRatioQuantity().intValue(), aggregateOptionPositionLeg.getPositionType()));
        }
        OptionCuratedListQuickAddRequest optionCuratedListQuickAddRequest = new OptionCuratedListQuickAddRequest(arrayList, null, 2, null);
        String strategyCode = uiAggregateOptionPosition.getAggregateOptionPosition().getStrategyCode();
        UUID id = uiAggregateOptionPosition.getAggregateOptionPosition().getId();
        if (uiAggregateOptionPosition.getLegs().size() == 1) {
            string2 = UiOptionStrategyDisplays.getStrategyTitleV2(uiAggregateOptionPosition, resources, uiAggregateOptionPosition.getOptionChain().getSymbol()).toString();
        } else {
            string2 = OptionExtensions2.getStrategyTitle$default(uiAggregateOptionPosition, resources, false, OptionChain.UnderlyingType.EQUITY, 2, null).toString();
        }
        this(optionCuratedListQuickAddRequest, strategyCode, id, string2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionStrategySecurity(Resources resources, OptionInstrument optionInstrument, OrderSide orderSide, UiOptionChain uiOptionChain) {
        this(new OptionCuratedListQuickAddRequest(CollectionsKt.listOf(new ApiOptionStrategyInfo.Leg(optionInstrument.getId(), 1, OptionPositionType.INSTANCE.m2736of(orderSide, OrderPositionEffect.OPEN))), null, 2, null), OptionInstruments3.getOpenPositionStrategyCode(optionInstrument, orderSide), optionInstrument.getId(), OptionInstruments.getTitleStringWithExpiration(optionInstrument, resources, uiOptionChain));
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
    }

    @Override // com.robinhood.models.p320db.Security
    public CuratedListObjectType getCuratedListObjectType() {
        return CuratedListObjectType.OPTION_STRATEGY;
    }

    @Override // com.robinhood.models.p320db.Security
    public String getDisplaySymbol() {
        return this.displaySymbol;
    }
}
