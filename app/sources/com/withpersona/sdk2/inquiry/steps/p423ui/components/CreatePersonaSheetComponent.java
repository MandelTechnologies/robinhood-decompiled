package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep2;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiComponentScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreatePersonaSheetComponent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b*\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\"\u0010\t\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b.\u0010-\"\u0004\b/\u00100R\"\u0010\n\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u00100R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b3\u0010-R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106¨\u00068"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "ctaCard", "url", "", "autoCompleteOnDismiss", "shown", "showing", "hideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "screen", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "getCtaCard", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "getUrl", "Z", "getAutoCompleteOnDismiss", "()Z", "getShown", "setShown", "(Z)V", "getShowing", "setShowing", "getHideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "getScreen", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Companion", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CreatePersonaSheetComponent implements SheetComponent {
    private final boolean autoCompleteOnDismiss;
    private final CreatePersonaSheet.CardCtaPage ctaCard;
    private final boolean hideWhenTappedOutside;
    private final String name;
    private final UiComponentScreen screen;
    private boolean showing;
    private boolean shown;
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CreatePersonaSheetComponent> CREATOR = new Creator();

    /* compiled from: CreatePersonaSheetComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreatePersonaSheetComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreatePersonaSheetComponent createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            CreatePersonaSheet.CardCtaPage cardCtaPage = (CreatePersonaSheet.CardCtaPage) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader());
            String string3 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new CreatePersonaSheetComponent(string2, cardCtaPage, string3, z4, z5, z2, z3, UiComponentScreen.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreatePersonaSheetComponent[] newArray(int i) {
            return new CreatePersonaSheetComponent[i];
        }
    }

    public static /* synthetic */ CreatePersonaSheetComponent copy$default(CreatePersonaSheetComponent createPersonaSheetComponent, String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z, boolean z2, boolean z3, boolean z4, UiComponentScreen uiComponentScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createPersonaSheetComponent.name;
        }
        if ((i & 2) != 0) {
            cardCtaPage = createPersonaSheetComponent.ctaCard;
        }
        if ((i & 4) != 0) {
            str2 = createPersonaSheetComponent.url;
        }
        if ((i & 8) != 0) {
            z = createPersonaSheetComponent.autoCompleteOnDismiss;
        }
        if ((i & 16) != 0) {
            z2 = createPersonaSheetComponent.shown;
        }
        if ((i & 32) != 0) {
            z3 = createPersonaSheetComponent.showing;
        }
        if ((i & 64) != 0) {
            z4 = createPersonaSheetComponent.hideWhenTappedOutside;
        }
        if ((i & 128) != 0) {
            uiComponentScreen = createPersonaSheetComponent.screen;
        }
        boolean z5 = z4;
        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
        boolean z6 = z2;
        boolean z7 = z3;
        return createPersonaSheetComponent.copy(str, cardCtaPage, str2, z, z6, z7, z5, uiComponentScreen2);
    }

    public final CreatePersonaSheetComponent copy(String name, CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean autoCompleteOnDismiss, boolean shown, boolean showing, boolean hideWhenTappedOutside, UiComponentScreen screen) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new CreatePersonaSheetComponent(name, ctaCard, url, autoCompleteOnDismiss, shown, showing, hideWhenTappedOutside, screen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePersonaSheetComponent)) {
            return false;
        }
        CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) other;
        return Intrinsics.areEqual(this.name, createPersonaSheetComponent.name) && Intrinsics.areEqual(this.ctaCard, createPersonaSheetComponent.ctaCard) && Intrinsics.areEqual(this.url, createPersonaSheetComponent.url) && this.autoCompleteOnDismiss == createPersonaSheetComponent.autoCompleteOnDismiss && this.shown == createPersonaSheetComponent.shown && this.showing == createPersonaSheetComponent.showing && this.hideWhenTappedOutside == createPersonaSheetComponent.hideWhenTappedOutside && Intrinsics.areEqual(this.screen, createPersonaSheetComponent.screen);
    }

    public int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.ctaCard.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.autoCompleteOnDismiss)) * 31) + Boolean.hashCode(this.shown)) * 31) + Boolean.hashCode(this.showing)) * 31) + Boolean.hashCode(this.hideWhenTappedOutside)) * 31) + this.screen.hashCode();
    }

    public String toString() {
        return "CreatePersonaSheetComponent(name=" + this.name + ", ctaCard=" + this.ctaCard + ", url=" + this.url + ", autoCompleteOnDismiss=" + this.autoCompleteOnDismiss + ", shown=" + this.shown + ", showing=" + this.showing + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ", screen=" + this.screen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.ctaCard, flags);
        dest.writeString(this.url);
        dest.writeInt(this.autoCompleteOnDismiss ? 1 : 0);
        dest.writeInt(this.shown ? 1 : 0);
        dest.writeInt(this.showing ? 1 : 0);
        dest.writeInt(this.hideWhenTappedOutside ? 1 : 0);
        this.screen.writeToParcel(dest, flags);
    }

    public CreatePersonaSheetComponent(String name, CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean z, boolean z2, boolean z3, boolean z4, UiComponentScreen screen) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.name = name;
        this.ctaCard = ctaCard;
        this.url = url;
        this.autoCompleteOnDismiss = z;
        this.shown = z2;
        this.showing = z3;
        this.hideWhenTappedOutside = z4;
        this.screen = screen;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    public final CreatePersonaSheet.CardCtaPage getCtaCard() {
        return this.ctaCard;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getAutoCompleteOnDismiss() {
        return this.autoCompleteOnDismiss;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent
    public boolean getShown() {
        return this.shown;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent
    public void setShown(boolean z) {
        this.shown = z;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent
    public boolean getShowing() {
        return this.showing;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent
    public void setShowing(boolean z) {
        this.showing = z;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent
    public boolean getHideWhenTappedOutside() {
        return this.hideWhenTappedOutside;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent
    public UiComponentScreen getScreen() {
        return this.screen;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreatePersonaSheetComponent(String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z, boolean z2, boolean z3, boolean z4, UiComponentScreen uiComponentScreen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        z4 = (i & 64) != 0 ? false : z4;
        if ((i & 128) != 0) {
            List<UiComponentConfig> components = cardCtaPage.getUiStep().getConfig().getComponents();
            List<UiComponent> listM3260to = components != null ? UiComponent3.m3260to(components) : null;
            List<UiComponentConfig> components2 = cardCtaPage.getUiStep().getConfig().getComponents();
            uiComponentScreen = NestedUiStep2.m3256to(new CtaCardPage(listM3260to, components2 == null ? CollectionsKt.emptyList() : components2, cardCtaPage.getUiStep().getStyles()));
        }
        this(str, cardCtaPage, str2, z, z2, z3, z4, uiComponentScreen);
    }

    /* compiled from: CreatePersonaSheetComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent$Companion;", "", "<init>", "()V", "fromConfig", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CreatePersonaSheetComponent fromConfig(CreatePersonaSheet config) {
            CreatePersonaSheet.Pages pages;
            CreatePersonaSheet.CardCtaPage ctaCard;
            CreatePersonaSheet.Attributes attributes;
            String url;
            Boolean autoCompleteOnDismiss;
            Intrinsics.checkNotNullParameter(config, "config");
            CreatePersonaSheet.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (pages = attributes2.getPages()) == null || (ctaCard = pages.getCtaCard()) == null || (attributes = config.getAttributes()) == null || (url = attributes.getUrl()) == null) {
                return null;
            }
            CreatePersonaSheet.Attributes attributes3 = config.getAttributes();
            return new CreatePersonaSheetComponent(config, ctaCard, url, (attributes3 == null || (autoCompleteOnDismiss = attributes3.getAutoCompleteOnDismiss()) == null) ? false : autoCompleteOnDismiss.booleanValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePersonaSheetComponent(CreatePersonaSheet config, CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean z) {
        this(config.getName(), ctaCard, url, z, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
