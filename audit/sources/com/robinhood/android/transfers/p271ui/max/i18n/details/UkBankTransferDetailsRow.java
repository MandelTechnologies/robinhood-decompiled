package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkBankTransferDetailsRow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsRow;", "", "header", "Lcom/robinhood/utils/resource/StringResource;", "content", "bentoIcon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/BentoIcons$Size16;)V", "getHeader", "()Lcom/robinhood/utils/resource/StringResource;", "getContent", "getBentoIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkBankTransferDetailsRow {
    public static final int $stable;
    private final BentoIcon4.Size16 bentoIcon;
    private final StringResource content;
    private final StringResource header;

    static {
        int i = BentoIcon4.Size16.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i2 | i2;
    }

    public static /* synthetic */ UkBankTransferDetailsRow copy$default(UkBankTransferDetailsRow ukBankTransferDetailsRow, StringResource stringResource, StringResource stringResource2, BentoIcon4.Size16 size16, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = ukBankTransferDetailsRow.header;
        }
        if ((i & 2) != 0) {
            stringResource2 = ukBankTransferDetailsRow.content;
        }
        if ((i & 4) != 0) {
            size16 = ukBankTransferDetailsRow.bentoIcon;
        }
        return ukBankTransferDetailsRow.copy(stringResource, stringResource2, size16);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final BentoIcon4.Size16 getBentoIcon() {
        return this.bentoIcon;
    }

    public final UkBankTransferDetailsRow copy(StringResource header, StringResource content, BentoIcon4.Size16 bentoIcon) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        return new UkBankTransferDetailsRow(header, content, bentoIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkBankTransferDetailsRow)) {
            return false;
        }
        UkBankTransferDetailsRow ukBankTransferDetailsRow = (UkBankTransferDetailsRow) other;
        return Intrinsics.areEqual(this.header, ukBankTransferDetailsRow.header) && Intrinsics.areEqual(this.content, ukBankTransferDetailsRow.content) && Intrinsics.areEqual(this.bentoIcon, ukBankTransferDetailsRow.bentoIcon);
    }

    public int hashCode() {
        int iHashCode = ((this.header.hashCode() * 31) + this.content.hashCode()) * 31;
        BentoIcon4.Size16 size16 = this.bentoIcon;
        return iHashCode + (size16 == null ? 0 : size16.hashCode());
    }

    public String toString() {
        return "UkBankTransferDetailsRow(header=" + this.header + ", content=" + this.content + ", bentoIcon=" + this.bentoIcon + ")";
    }

    public UkBankTransferDetailsRow(StringResource header, StringResource content, BentoIcon4.Size16 size16) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        this.header = header;
        this.content = content;
        this.bentoIcon = size16;
    }

    public /* synthetic */ UkBankTransferDetailsRow(StringResource stringResource, StringResource stringResource2, BentoIcon4.Size16 size16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, (i & 4) != 0 ? null : size16);
    }

    public final StringResource getHeader() {
        return this.header;
    }

    public final StringResource getContent() {
        return this.content;
    }

    public final BentoIcon4.Size16 getBentoIcon() {
        return this.bentoIcon;
    }
}
