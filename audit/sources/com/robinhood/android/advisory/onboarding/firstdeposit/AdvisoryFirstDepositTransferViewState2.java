package com.robinhood.android.advisory.onboarding.firstdeposit;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryFirstDepositTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer;", "", "Label", "Sdui", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer$Label;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer$Sdui;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AmountInfoDisclaimer, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisoryFirstDepositTransferViewState2 {

    /* compiled from: AdvisoryFirstDepositTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer$Label;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer;", "resource", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getResource", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AmountInfoDisclaimer$Label, reason: from toString */
    public static final /* data */ class Label implements AdvisoryFirstDepositTransferViewState2 {
        public static final int $stable = StringResource.$stable;
        private final StringResource resource;

        public static /* synthetic */ Label copy$default(Label label, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = label.resource;
            }
            return label.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getResource() {
            return this.resource;
        }

        public final Label copy(StringResource resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            return new Label(resource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Label) && Intrinsics.areEqual(this.resource, ((Label) other).resource);
        }

        public int hashCode() {
            return this.resource.hashCode();
        }

        public String toString() {
            return "Label(resource=" + this.resource + ")";
        }

        public Label(StringResource resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.resource = resource;
        }

        public final StringResource getResource() {
            return this.resource;
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer$Sdui;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer;", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getContent", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AmountInfoDisclaimer$Sdui, reason: from toString */
    public static final /* data */ class Sdui implements AdvisoryFirstDepositTransferViewState2 {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> content;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sdui copy$default(Sdui sdui, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = sdui.content;
            }
            return sdui.copy(immutableList);
        }

        public final ImmutableList<UIComponent<GenericAction>> component1() {
            return this.content;
        }

        public final Sdui copy(ImmutableList<? extends UIComponent<? extends GenericAction>> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Sdui(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sdui) && Intrinsics.areEqual(this.content, ((Sdui) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Sdui(content=" + this.content + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sdui(ImmutableList<? extends UIComponent<? extends GenericAction>> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final ImmutableList<UIComponent<GenericAction>> getContent() {
            return this.content;
        }
    }
}
