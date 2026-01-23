package com.robinhood.android.crypto.p094ui.detail.description;

import android.content.res.Resources;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import md_server_proxy.service.p483v1.FundamentalDto;
import md_server_proxy.service.p483v1.KeyInfoDocumentDto;

/* compiled from: CryptoDescriptionDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDataState;", "", "cryptoDescription", "Lcom/robinhood/models/crypto/db/CryptoDescription;", "fundamental", "Lmd_server_proxy/service/v1/FundamentalDto;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoDescription;Lmd_server_proxy/service/v1/FundamentalDto;)V", "description", "", "getDescription", "()Ljava/lang/String;", "descriptionText", "Lcom/robinhood/utils/resource/StringResource;", "getDescriptionText", "()Lcom/robinhood/utils/resource/StringResource;", "fundamentalList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "resources", "Landroid/content/res/Resources;", "keyInfoDoc", "Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "getKeyInfoDoc", "()Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "shouldShowFundamental", "", "isVisible", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDescriptionDataState {
    public static final int $stable = 8;
    private final CryptoDescription cryptoDescription;
    private final FundamentalDto fundamental;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDescriptionDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final CryptoDescription getCryptoDescription() {
        return this.cryptoDescription;
    }

    /* renamed from: component2, reason: from getter */
    private final FundamentalDto getFundamental() {
        return this.fundamental;
    }

    public static /* synthetic */ CryptoDescriptionDataState copy$default(CryptoDescriptionDataState cryptoDescriptionDataState, CryptoDescription cryptoDescription, FundamentalDto fundamentalDto, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoDescription = cryptoDescriptionDataState.cryptoDescription;
        }
        if ((i & 2) != 0) {
            fundamentalDto = cryptoDescriptionDataState.fundamental;
        }
        return cryptoDescriptionDataState.copy(cryptoDescription, fundamentalDto);
    }

    public final CryptoDescriptionDataState copy(CryptoDescription cryptoDescription, FundamentalDto fundamental) {
        return new CryptoDescriptionDataState(cryptoDescription, fundamental);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDescriptionDataState)) {
            return false;
        }
        CryptoDescriptionDataState cryptoDescriptionDataState = (CryptoDescriptionDataState) other;
        return Intrinsics.areEqual(this.cryptoDescription, cryptoDescriptionDataState.cryptoDescription) && Intrinsics.areEqual(this.fundamental, cryptoDescriptionDataState.fundamental);
    }

    public int hashCode() {
        CryptoDescription cryptoDescription = this.cryptoDescription;
        int iHashCode = (cryptoDescription == null ? 0 : cryptoDescription.hashCode()) * 31;
        FundamentalDto fundamentalDto = this.fundamental;
        return iHashCode + (fundamentalDto != null ? fundamentalDto.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDescriptionDataState(cryptoDescription=" + this.cryptoDescription + ", fundamental=" + this.fundamental + ")";
    }

    public CryptoDescriptionDataState(CryptoDescription cryptoDescription, FundamentalDto fundamentalDto) {
        this.cryptoDescription = cryptoDescription;
        this.fundamental = fundamentalDto;
    }

    public /* synthetic */ CryptoDescriptionDataState(CryptoDescription cryptoDescription, FundamentalDto fundamentalDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoDescription, (i & 2) != 0 ? null : fundamentalDto);
    }

    private final String getDescription() {
        String description;
        CryptoDescription cryptoDescription = this.cryptoDescription;
        if (cryptoDescription != null && (description = cryptoDescription.getDescription()) != null) {
            return description;
        }
        FundamentalDto fundamentalDto = this.fundamental;
        if (fundamentalDto != null) {
            return fundamentalDto.getDescription();
        }
        return null;
    }

    public final StringResource getDescriptionText() {
        String description = getDescription();
        if (description == null || StringsKt.isBlank(description)) {
            return null;
        }
        return StringResource.INSTANCE.invoke(description);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList<BentoDataRowState> fundamentalList(Resources resources) throws Resources.NotFoundException {
        String headquarters_city;
        Integer num_employees;
        Integer year_founded;
        String string2;
        String ceo;
        Intrinsics.checkNotNullParameter(resources, "resources");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        FundamentalDto fundamentalDto = this.fundamental;
        int i = 2;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        if (fundamentalDto != null && (ceo = fundamentalDto.getCeo()) != null && ceo.length() > 0) {
            String string3 = resources.getString(C12757R.string.crypto_detail_about_ceo_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            listCreateListBuilder.add(new BentoDataRowState(null, new AnnotatedString(string3, list, i, objArr15 == true ? 1 : 0), null, null, null, new AnnotatedString(this.fundamental.getCeo(), objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0), null, null, null, null, false, false, 4061, null));
        }
        FundamentalDto fundamentalDto2 = this.fundamental;
        if (fundamentalDto2 != null && (year_founded = fundamentalDto2.getYear_founded()) != null && (string2 = year_founded.toString()) != null) {
            String string4 = resources.getString(C12757R.string.crypto_detail_about_founded_label);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            listCreateListBuilder.add(new BentoDataRowState(null, new AnnotatedString(string4, objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0), null, null, null, new AnnotatedString(string2, objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0), null, null, null, null, false, false, 4061, null));
        }
        FundamentalDto fundamentalDto3 = this.fundamental;
        if (fundamentalDto3 != null && (num_employees = fundamentalDto3.getNum_employees()) != null) {
            int iIntValue = num_employees.intValue();
            String string5 = resources.getString(C12757R.string.crypto_detail_about_employees_label);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            listCreateListBuilder.add(new BentoDataRowState(null, new AnnotatedString(string5, objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), null, null, null, new AnnotatedString(FormatsLocalized.getIntegerFormat().format(Integer.valueOf(iIntValue)), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), null, null, null, null, false, false, 4061, null));
        }
        FundamentalDto fundamentalDto4 = this.fundamental;
        if (fundamentalDto4 != null && (headquarters_city = fundamentalDto4.getHeadquarters_city()) != null && headquarters_city.length() > 0) {
            String string6 = resources.getString(C12757R.string.crypto_detail_about_hq_label);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            AnnotatedString annotatedString = new AnnotatedString(string6, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
            String string7 = resources.getString(C12757R.string.crypto_detail_about_hq_format, this.fundamental.getHeadquarters_city(), this.fundamental.getHeadquarters_state());
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            listCreateListBuilder.add(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string7, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, null, null, null, false, false, 4061, null));
        }
        return extensions2.toImmutableList(CollectionsKt.build(listCreateListBuilder));
    }

    public final KeyInfoDocumentDto getKeyInfoDoc() {
        FundamentalDto fundamentalDto = this.fundamental;
        if (fundamentalDto != null) {
            return fundamentalDto.getKey_info_document();
        }
        return null;
    }

    public final boolean shouldShowFundamental(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return !fundamentalList(resources).isEmpty();
    }

    public final boolean isVisible(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getDescriptionText() != null || shouldShowFundamental(resources);
    }
}
