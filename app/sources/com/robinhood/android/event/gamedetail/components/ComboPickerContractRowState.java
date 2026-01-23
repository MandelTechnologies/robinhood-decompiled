package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboPickerContractRow.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ComboPickerContractRowState;", "", "key", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "contractIdWithSide", "iconUrl", "Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;", "title", "", "subtitle", "valueButton", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/event/gamedetail/components/ValueButtonState;Lcom/robinhood/utils/resource/StringResource;)V", "getKey", "()Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "getContractIdWithSide", "getIconUrl", "()Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getValueButton", "()Lcom/robinhood/android/event/gamedetail/components/ValueButtonState;", "getPrice", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ComboPickerContractRowState {
    public static final int $stable = 0;
    private final ContractIdWithSide contractIdWithSide;
    private final DayNightImageUrl iconUrl;
    private final ContractIdWithSide key;
    private final StringResource price;
    private final String subtitle;
    private final String title;
    private final ComboPickerContractRow3 valueButton;

    public static /* synthetic */ ComboPickerContractRowState copy$default(ComboPickerContractRowState comboPickerContractRowState, ContractIdWithSide contractIdWithSide, ContractIdWithSide contractIdWithSide2, DayNightImageUrl dayNightImageUrl, String str, String str2, ComboPickerContractRow3 comboPickerContractRow3, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            contractIdWithSide = comboPickerContractRowState.key;
        }
        if ((i & 2) != 0) {
            contractIdWithSide2 = comboPickerContractRowState.contractIdWithSide;
        }
        if ((i & 4) != 0) {
            dayNightImageUrl = comboPickerContractRowState.iconUrl;
        }
        if ((i & 8) != 0) {
            str = comboPickerContractRowState.title;
        }
        if ((i & 16) != 0) {
            str2 = comboPickerContractRowState.subtitle;
        }
        if ((i & 32) != 0) {
            comboPickerContractRow3 = comboPickerContractRowState.valueButton;
        }
        if ((i & 64) != 0) {
            stringResource = comboPickerContractRowState.price;
        }
        ComboPickerContractRow3 comboPickerContractRow32 = comboPickerContractRow3;
        StringResource stringResource2 = stringResource;
        String str3 = str2;
        DayNightImageUrl dayNightImageUrl2 = dayNightImageUrl;
        return comboPickerContractRowState.copy(contractIdWithSide, contractIdWithSide2, dayNightImageUrl2, str, str3, comboPickerContractRow32, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractIdWithSide getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final ContractIdWithSide getContractIdWithSide() {
        return this.contractIdWithSide;
    }

    /* renamed from: component3, reason: from getter */
    public final DayNightImageUrl getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final ComboPickerContractRow3 getValueButton() {
        return this.valueButton;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getPrice() {
        return this.price;
    }

    public final ComboPickerContractRowState copy(ContractIdWithSide key, ContractIdWithSide contractIdWithSide, DayNightImageUrl iconUrl, String title, String subtitle, ComboPickerContractRow3 valueButton, StringResource price) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new ComboPickerContractRowState(key, contractIdWithSide, iconUrl, title, subtitle, valueButton, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboPickerContractRowState)) {
            return false;
        }
        ComboPickerContractRowState comboPickerContractRowState = (ComboPickerContractRowState) other;
        return Intrinsics.areEqual(this.key, comboPickerContractRowState.key) && Intrinsics.areEqual(this.contractIdWithSide, comboPickerContractRowState.contractIdWithSide) && Intrinsics.areEqual(this.iconUrl, comboPickerContractRowState.iconUrl) && Intrinsics.areEqual(this.title, comboPickerContractRowState.title) && Intrinsics.areEqual(this.subtitle, comboPickerContractRowState.subtitle) && Intrinsics.areEqual(this.valueButton, comboPickerContractRowState.valueButton) && Intrinsics.areEqual(this.price, comboPickerContractRowState.price);
    }

    public int hashCode() {
        int iHashCode = ((((this.key.hashCode() * 31) + this.contractIdWithSide.hashCode()) * 31) + this.iconUrl.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ComboPickerContractRow3 comboPickerContractRow3 = this.valueButton;
        int iHashCode4 = (iHashCode3 + (comboPickerContractRow3 == null ? 0 : comboPickerContractRow3.hashCode())) * 31;
        StringResource stringResource = this.price;
        return iHashCode4 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "ComboPickerContractRowState(key=" + this.key + ", contractIdWithSide=" + this.contractIdWithSide + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", valueButton=" + this.valueButton + ", price=" + this.price + ")";
    }

    public ComboPickerContractRowState(ContractIdWithSide key, ContractIdWithSide contractIdWithSide, DayNightImageUrl iconUrl, String str, String str2, ComboPickerContractRow3 comboPickerContractRow3, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.key = key;
        this.contractIdWithSide = contractIdWithSide;
        this.iconUrl = iconUrl;
        this.title = str;
        this.subtitle = str2;
        this.valueButton = comboPickerContractRow3;
        this.price = stringResource;
    }

    public final ContractIdWithSide getKey() {
        return this.key;
    }

    public final ContractIdWithSide getContractIdWithSide() {
        return this.contractIdWithSide;
    }

    public final DayNightImageUrl getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ComboPickerContractRow3 getValueButton() {
        return this.valueButton;
    }

    public final StringResource getPrice() {
        return this.price;
    }
}
