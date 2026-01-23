package com.robinhood.iac.alertsheet.p295ui;

import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.IacAlertSheetStyle;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacAlertSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0012HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState;", "", "iacAlertSheet", "Lcom/robinhood/models/ui/IacAlertSheet;", "<init>", "(Lcom/robinhood/models/ui/IacAlertSheet;)V", "getIacAlertSheet", "()Lcom/robinhood/models/ui/IacAlertSheet;", ResourceTypes.STYLE, "Lcom/robinhood/models/ui/IacAlertSheetStyle;", "mapper", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "backgroundColor", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor;", "getBackgroundColor", "()Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor;", "getTextColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "getLinkTextColor", "getButtonColor", "button", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "getButtonTextColor", "getButtonStyle", "getPogBackgroundColor", "getPogForegroundColor", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "BackgroundColor", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IacAlertSheetViewState {
    public static final int $stable = 8;
    private final IacAlertSheet iacAlertSheet;
    private final ServerToBentoColorMapper mapper;
    private final IacAlertSheetStyle style;

    /* compiled from: IacAlertSheetViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericButtonType.values().length];
            try {
                iArr[GenericButtonType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericButtonType.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenericButtonType.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GenericButtonType.TERTIARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ IacAlertSheetViewState copy$default(IacAlertSheetViewState iacAlertSheetViewState, IacAlertSheet iacAlertSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            iacAlertSheet = iacAlertSheetViewState.iacAlertSheet;
        }
        return iacAlertSheetViewState.copy(iacAlertSheet);
    }

    /* renamed from: component1, reason: from getter */
    public final IacAlertSheet getIacAlertSheet() {
        return this.iacAlertSheet;
    }

    public final IacAlertSheetViewState copy(IacAlertSheet iacAlertSheet) {
        Intrinsics.checkNotNullParameter(iacAlertSheet, "iacAlertSheet");
        return new IacAlertSheetViewState(iacAlertSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacAlertSheetViewState) && Intrinsics.areEqual(this.iacAlertSheet, ((IacAlertSheetViewState) other).iacAlertSheet);
    }

    public int hashCode() {
        return this.iacAlertSheet.hashCode();
    }

    public String toString() {
        return "IacAlertSheetViewState(iacAlertSheet=" + this.iacAlertSheet + ")";
    }

    public IacAlertSheetViewState(IacAlertSheet iacAlertSheet) {
        Intrinsics.checkNotNullParameter(iacAlertSheet, "iacAlertSheet");
        this.iacAlertSheet = iacAlertSheet;
        this.style = iacAlertSheet.getStyle();
        this.mapper = ServerToBentoColorMapper.INSTANCE;
    }

    public final IacAlertSheet getIacAlertSheet() {
        return this.iacAlertSheet;
    }

    public final BackgroundColor getBackgroundColor() {
        LinearGradientColor linearGradientColor = this.style.getLinearGradientColor();
        if (linearGradientColor != null && linearGradientColor.getColorStops().size() > 1) {
            return new BackgroundColor.Gradient(linearGradientColor);
        }
        return new BackgroundColor.Solid(IacAlertSheetViewState2.mapColor(this.mapper, this.style.getBackgroundColor(), C13997R.attr.paletteColorMineral, C20690R.attr.colorBackground1));
    }

    public final ResourceReferences4<Integer> getTextColor() {
        return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getTextColor(), C20690R.attr.colorForeground1);
    }

    public final ResourceReferences4<Integer> getLinkTextColor() {
        return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getLinkTextColor(), C20690R.attr.colorPositive);
    }

    public final ResourceReferences4<Integer> getButtonColor(GenericButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        int i = WhenMappings.$EnumSwitchMapping$0[button.getGenericButtonType().ordinal()];
        if (i == 1 || i == 2) {
            return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getPrimaryButtonTypeBackgroundColor(), C20690R.attr.colorForeground1);
        }
        return new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent);
    }

    public final ResourceReferences4<Integer> getButtonTextColor(GenericButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        int i = WhenMappings.$EnumSwitchMapping$0[button.getGenericButtonType().ordinal()];
        if (i == 1 || i == 2) {
            return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getPrimaryButtonTypeTextColor(), C20690R.attr.colorBackground1);
        }
        if (i == 3) {
            return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getSecondaryButtonTypeTextColor(), C20690R.attr.colorForeground1);
        }
        if (i == 4) {
            return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getTertiaryButtonTypeTextColor(), C20690R.attr.colorBackground1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getButtonStyle(GenericButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        int i = WhenMappings.$EnumSwitchMapping$0[button.getGenericButtonType().ordinal()];
        if (i == 1 || i == 2) {
            return C20690R.attr.primaryMonochromeButtonStyle;
        }
        if (i == 3) {
            return C20690R.attr.legacyGhostMonochromeButtonStyle;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C20690R.attr.secondaryButtonStyle;
    }

    public final ResourceReferences4<Integer> getPogBackgroundColor() {
        return IacAlertSheetViewState2.mapColor(this.mapper, this.style.getPogBackgroundColor(), C20690R.attr.colorPogBackground);
    }

    public final ResourceReferences4<Integer> getPogForegroundColor() {
        ThemedColor pogForegroundColor = this.style.getPogForegroundColor();
        if (pogForegroundColor != null) {
            return IacAlertSheetViewState2.mapColor(this.mapper, pogForegroundColor, C20690R.attr.colorPogPictogram);
        }
        return null;
    }

    /* compiled from: IacAlertSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor;", "", "<init>", "()V", "Solid", "Gradient", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor$Gradient;", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor$Solid;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class BackgroundColor {
        public static final int $stable = 0;

        public /* synthetic */ BackgroundColor(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: IacAlertSheetViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor$Solid;", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor;", "colorResourceRef", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "getColorResourceRef", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Solid extends BackgroundColor {
            public static final int $stable = ResourceReferences4.$stable;
            private final ResourceReferences4<Integer> colorResourceRef;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Solid(ResourceReferences4<Integer> colorResourceRef) {
                super(null);
                Intrinsics.checkNotNullParameter(colorResourceRef, "colorResourceRef");
                this.colorResourceRef = colorResourceRef;
            }

            public final ResourceReferences4<Integer> getColorResourceRef() {
                return this.colorResourceRef;
            }
        }

        private BackgroundColor() {
        }

        /* compiled from: IacAlertSheetViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor$Gradient;", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState$BackgroundColor;", "linearGradientColor", "Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;)V", "getLinearGradientColor", "()Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Gradient extends BackgroundColor {
            public static final int $stable = 8;
            private final LinearGradientColor linearGradientColor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Gradient(LinearGradientColor linearGradientColor) {
                super(null);
                Intrinsics.checkNotNullParameter(linearGradientColor, "linearGradientColor");
                this.linearGradientColor = linearGradientColor;
            }

            public final LinearGradientColor getLinearGradientColor() {
                return this.linearGradientColor;
            }
        }
    }
}
