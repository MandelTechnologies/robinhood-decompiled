package com.robinhood.android.beneficiaries.p067ui.selectaccount;

import com.robinhood.android.beneficiaries.models.api.BeneficiaryAccountSelectorViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiarySelectAccountDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountDataState;", "", "title", "", "subtitleMarkdown", "accountSelectorViewModels", "", "Lcom/robinhood/android/beneficiaries/models/api/BeneficiaryAccountSelectorViewModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getAccountSelectorViewModels", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiarySelectAccountDataState {
    public static final int $stable = 8;
    private final List<BeneficiaryAccountSelectorViewModel> accountSelectorViewModels;
    private final String subtitleMarkdown;
    private final String title;

    public BeneficiarySelectAccountDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiarySelectAccountDataState copy$default(BeneficiarySelectAccountDataState beneficiarySelectAccountDataState, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiarySelectAccountDataState.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiarySelectAccountDataState.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            list = beneficiarySelectAccountDataState.accountSelectorViewModels;
        }
        return beneficiarySelectAccountDataState.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<BeneficiaryAccountSelectorViewModel> component3() {
        return this.accountSelectorViewModels;
    }

    public final BeneficiarySelectAccountDataState copy(String title, String subtitleMarkdown, List<BeneficiaryAccountSelectorViewModel> accountSelectorViewModels) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        return new BeneficiarySelectAccountDataState(title, subtitleMarkdown, accountSelectorViewModels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiarySelectAccountDataState)) {
            return false;
        }
        BeneficiarySelectAccountDataState beneficiarySelectAccountDataState = (BeneficiarySelectAccountDataState) other;
        return Intrinsics.areEqual(this.title, beneficiarySelectAccountDataState.title) && Intrinsics.areEqual(this.subtitleMarkdown, beneficiarySelectAccountDataState.subtitleMarkdown) && Intrinsics.areEqual(this.accountSelectorViewModels, beneficiarySelectAccountDataState.accountSelectorViewModels);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.subtitleMarkdown.hashCode()) * 31;
        List<BeneficiaryAccountSelectorViewModel> list = this.accountSelectorViewModels;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "BeneficiarySelectAccountDataState(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", accountSelectorViewModels=" + this.accountSelectorViewModels + ")";
    }

    public BeneficiarySelectAccountDataState(String title, String subtitleMarkdown, List<BeneficiaryAccountSelectorViewModel> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        this.title = title;
        this.subtitleMarkdown = subtitleMarkdown;
        this.accountSelectorViewModels = list;
    }

    public /* synthetic */ BeneficiarySelectAccountDataState(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<BeneficiaryAccountSelectorViewModel> getAccountSelectorViewModels() {
        return this.accountSelectorViewModels;
    }
}
