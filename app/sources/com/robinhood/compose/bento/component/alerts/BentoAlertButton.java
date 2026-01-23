package com.robinhood.compose.bento.component.alerts;

import androidx.compose.p011ui.Modifier;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoAlerts.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0011B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "", "title", "", "onClick", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "buttonTypeOverride", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "icon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "loading", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Type;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Z)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/BentoButtons$Type;)V", "getTitle", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getModifier", "()Landroidx/compose/ui/Modifier;", "getButtonTypeOverride", "()Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "getLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoAlertButton {
    public static final int $stable = 0;
    private final BentoButtons.Type buttonTypeOverride;
    private final BentoButtons.Icon.Size16 icon;
    private final boolean loading;
    private final Modifier modifier;
    private final Function0<Unit> onClick;
    private final String title;

    public static /* synthetic */ BentoAlertButton copy$default(BentoAlertButton bentoAlertButton, String str, Function0 function0, Modifier modifier, BentoButtons.Type type2, BentoButtons.Icon.Size16 size16, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bentoAlertButton.title;
        }
        if ((i & 2) != 0) {
            function0 = bentoAlertButton.onClick;
        }
        if ((i & 4) != 0) {
            modifier = bentoAlertButton.modifier;
        }
        if ((i & 8) != 0) {
            type2 = bentoAlertButton.buttonTypeOverride;
        }
        if ((i & 16) != 0) {
            size16 = bentoAlertButton.icon;
        }
        if ((i & 32) != 0) {
            z = bentoAlertButton.loading;
        }
        BentoButtons.Icon.Size16 size162 = size16;
        boolean z2 = z;
        return bentoAlertButton.copy(str, function0, modifier, type2, size162, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Function0<Unit> component2() {
        return this.onClick;
    }

    /* renamed from: component3, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoButtons.Type getButtonTypeOverride() {
        return this.buttonTypeOverride;
    }

    /* renamed from: component5, reason: from getter */
    public final BentoButtons.Icon.Size16 getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final BentoAlertButton copy(String title, Function0<Unit> onClick, Modifier modifier, BentoButtons.Type buttonTypeOverride, BentoButtons.Icon.Size16 icon, boolean loading) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return new BentoAlertButton(title, onClick, modifier, buttonTypeOverride, icon, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoAlertButton)) {
            return false;
        }
        BentoAlertButton bentoAlertButton = (BentoAlertButton) other;
        return Intrinsics.areEqual(this.title, bentoAlertButton.title) && Intrinsics.areEqual(this.onClick, bentoAlertButton.onClick) && Intrinsics.areEqual(this.modifier, bentoAlertButton.modifier) && this.buttonTypeOverride == bentoAlertButton.buttonTypeOverride && Intrinsics.areEqual(this.icon, bentoAlertButton.icon) && this.loading == bentoAlertButton.loading;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.onClick.hashCode()) * 31) + this.modifier.hashCode()) * 31;
        BentoButtons.Type type2 = this.buttonTypeOverride;
        int iHashCode2 = (iHashCode + (type2 == null ? 0 : type2.hashCode())) * 31;
        BentoButtons.Icon.Size16 size16 = this.icon;
        return ((iHashCode2 + (size16 != null ? size16.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "BentoAlertButton(title=" + this.title + ", onClick=" + this.onClick + ", modifier=" + this.modifier + ", buttonTypeOverride=" + this.buttonTypeOverride + ", icon=" + this.icon + ", loading=" + this.loading + ")";
    }

    public BentoAlertButton(String title, Function0<Unit> onClick, Modifier modifier, BentoButtons.Type type2, BentoButtons.Icon.Size16 size16, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.title = title;
        this.onClick = onClick;
        this.modifier = modifier;
        this.buttonTypeOverride = type2;
        this.icon = size16;
        this.loading = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public /* synthetic */ BentoAlertButton(String str, Function0 function0, Modifier modifier, BentoButtons.Type type2, BentoButtons.Icon.Size16 size16, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i & 4) != 0 ? Modifier.INSTANCE : modifier, (i & 8) != 0 ? null : type2, (i & 16) != 0 ? null : size16, (i & 32) != 0 ? false : z);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final BentoButtons.Type getButtonTypeOverride() {
        return this.buttonTypeOverride;
    }

    public final BentoButtons.Icon.Size16 getIcon() {
        return this.icon;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BentoAlertButton(String title, Function0<Unit> onClick) {
        this(title, onClick, Modifier.INSTANCE, null, null, false, 48, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BentoAlertButton(String title, Function0<Unit> onClick, BentoButtons.Type type2) {
        this(title, onClick, Modifier.INSTANCE, type2, null, false, 48, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
    }
}
