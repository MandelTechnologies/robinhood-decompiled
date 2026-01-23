package com.robinhood.android.advisory.onboarding.retirement.recommendation.intro;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.advisory.api.ClientActionComponent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountRecommendationIntroScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/intro/AccountRecommendationIntroViewState;", "", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/advisory/api/ClientActionComponent;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/advisory/api/ClientActionComponent;)V", "getContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooter", "getCta", "()Lcom/robinhood/models/advisory/api/ClientActionComponent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountRecommendationIntroViewState {
    public static final int $stable = 8;
    private final ImmutableList<UIComponent<GenericAction>> content;
    private final ClientActionComponent cta;
    private final ImmutableList<UIComponent<GenericAction>> footer;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountRecommendationIntroViewState copy$default(AccountRecommendationIntroViewState accountRecommendationIntroViewState, ImmutableList immutableList, ImmutableList immutableList2, ClientActionComponent clientActionComponent, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = accountRecommendationIntroViewState.content;
        }
        if ((i & 2) != 0) {
            immutableList2 = accountRecommendationIntroViewState.footer;
        }
        if ((i & 4) != 0) {
            clientActionComponent = accountRecommendationIntroViewState.cta;
        }
        return accountRecommendationIntroViewState.copy(immutableList, immutableList2, clientActionComponent);
    }

    public final ImmutableList<UIComponent<GenericAction>> component1() {
        return this.content;
    }

    public final ImmutableList<UIComponent<GenericAction>> component2() {
        return this.footer;
    }

    /* renamed from: component3, reason: from getter */
    public final ClientActionComponent getCta() {
        return this.cta;
    }

    public final AccountRecommendationIntroViewState copy(ImmutableList<? extends UIComponent<? extends GenericAction>> content, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ClientActionComponent cta) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cta, "cta");
        return new AccountRecommendationIntroViewState(content, footer, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRecommendationIntroViewState)) {
            return false;
        }
        AccountRecommendationIntroViewState accountRecommendationIntroViewState = (AccountRecommendationIntroViewState) other;
        return Intrinsics.areEqual(this.content, accountRecommendationIntroViewState.content) && Intrinsics.areEqual(this.footer, accountRecommendationIntroViewState.footer) && Intrinsics.areEqual(this.cta, accountRecommendationIntroViewState.cta);
    }

    public int hashCode() {
        return (((this.content.hashCode() * 31) + this.footer.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "AccountRecommendationIntroViewState(content=" + this.content + ", footer=" + this.footer + ", cta=" + this.cta + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountRecommendationIntroViewState(ImmutableList<? extends UIComponent<? extends GenericAction>> content, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ClientActionComponent cta) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.content = content;
        this.footer = footer;
        this.cta = cta;
    }

    public final ImmutableList<UIComponent<GenericAction>> getContent() {
        return this.content;
    }

    public final ImmutableList<UIComponent<GenericAction>> getFooter() {
        return this.footer;
    }

    public final ClientActionComponent getCta() {
        return this.cta;
    }
}
