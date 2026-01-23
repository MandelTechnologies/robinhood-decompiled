package com.robinhood.shared.crypto.expandableButtonTray;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ColorDto;

/* compiled from: CryptoExpandableButtonTrayComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004./01B[\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003Je\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "T", "", "expandButton", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandButton;", CarResultComposable2.BUTTONS, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "prefixContentState", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;", "showWideButtons", "", "alwaysShowExpandButton", "expandAnimationType", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandAnimationType;", "closeButtonTintOverride", "Lrh_server_driven_ui/v1/ColorDto;", "<init>", "(Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandButton;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;ZZLcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandAnimationType;Lrh_server_driven_ui/v1/ColorDto;)V", "getExpandButton", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandButton;", "getButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "getPrefixContentState", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;", "getShowWideButtons", "()Z", "getAlwaysShowExpandButton", "getExpandAnimationType", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandAnimationType;", "getCloseButtonTintOverride", "()Lrh_server_driven_ui/v1/ColorDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "PrefixContentState", "ExpandButton", "ActionButton", "ExpandAnimationType", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ExpandableButtonTrayState<T> {
    public static final int $stable = StringResource.$stable;
    private final boolean alwaysShowExpandButton;
    private final ImmutableList<ActionButton<T>> buttons;
    private final ColorDto closeButtonTintOverride;
    private final ExpandAnimationType expandAnimationType;
    private final ExpandButton expandButton;
    private final PrefixContentState prefixContentState;
    private final boolean showWideButtons;

    public static /* synthetic */ ExpandableButtonTrayState copy$default(ExpandableButtonTrayState expandableButtonTrayState, ExpandButton expandButton, ImmutableList immutableList, PrefixContentState prefixContentState, boolean z, boolean z2, ExpandAnimationType expandAnimationType, ColorDto colorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            expandButton = expandableButtonTrayState.expandButton;
        }
        if ((i & 2) != 0) {
            immutableList = expandableButtonTrayState.buttons;
        }
        if ((i & 4) != 0) {
            prefixContentState = expandableButtonTrayState.prefixContentState;
        }
        if ((i & 8) != 0) {
            z = expandableButtonTrayState.showWideButtons;
        }
        if ((i & 16) != 0) {
            z2 = expandableButtonTrayState.alwaysShowExpandButton;
        }
        if ((i & 32) != 0) {
            expandAnimationType = expandableButtonTrayState.expandAnimationType;
        }
        if ((i & 64) != 0) {
            colorDto = expandableButtonTrayState.closeButtonTintOverride;
        }
        ExpandAnimationType expandAnimationType2 = expandAnimationType;
        ColorDto colorDto2 = colorDto;
        boolean z3 = z2;
        PrefixContentState prefixContentState2 = prefixContentState;
        return expandableButtonTrayState.copy(expandButton, immutableList, prefixContentState2, z, z3, expandAnimationType2, colorDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final ExpandButton getExpandButton() {
        return this.expandButton;
    }

    public final ImmutableList<ActionButton<T>> component2() {
        return this.buttons;
    }

    /* renamed from: component3, reason: from getter */
    public final PrefixContentState getPrefixContentState() {
        return this.prefixContentState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowWideButtons() {
        return this.showWideButtons;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAlwaysShowExpandButton() {
        return this.alwaysShowExpandButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ExpandAnimationType getExpandAnimationType() {
        return this.expandAnimationType;
    }

    /* renamed from: component7, reason: from getter */
    public final ColorDto getCloseButtonTintOverride() {
        return this.closeButtonTintOverride;
    }

    public final ExpandableButtonTrayState<T> copy(ExpandButton expandButton, ImmutableList<? extends ActionButton<T>> buttons, PrefixContentState prefixContentState, boolean showWideButtons, boolean alwaysShowExpandButton, ExpandAnimationType expandAnimationType, ColorDto closeButtonTintOverride) {
        Intrinsics.checkNotNullParameter(expandButton, "expandButton");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(expandAnimationType, "expandAnimationType");
        return new ExpandableButtonTrayState<>(expandButton, buttons, prefixContentState, showWideButtons, alwaysShowExpandButton, expandAnimationType, closeButtonTintOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableButtonTrayState)) {
            return false;
        }
        ExpandableButtonTrayState expandableButtonTrayState = (ExpandableButtonTrayState) other;
        return Intrinsics.areEqual(this.expandButton, expandableButtonTrayState.expandButton) && Intrinsics.areEqual(this.buttons, expandableButtonTrayState.buttons) && Intrinsics.areEqual(this.prefixContentState, expandableButtonTrayState.prefixContentState) && this.showWideButtons == expandableButtonTrayState.showWideButtons && this.alwaysShowExpandButton == expandableButtonTrayState.alwaysShowExpandButton && this.expandAnimationType == expandableButtonTrayState.expandAnimationType && this.closeButtonTintOverride == expandableButtonTrayState.closeButtonTintOverride;
    }

    public int hashCode() {
        int iHashCode = ((this.expandButton.hashCode() * 31) + this.buttons.hashCode()) * 31;
        PrefixContentState prefixContentState = this.prefixContentState;
        int iHashCode2 = (((((((iHashCode + (prefixContentState == null ? 0 : prefixContentState.hashCode())) * 31) + Boolean.hashCode(this.showWideButtons)) * 31) + Boolean.hashCode(this.alwaysShowExpandButton)) * 31) + this.expandAnimationType.hashCode()) * 31;
        ColorDto colorDto = this.closeButtonTintOverride;
        return iHashCode2 + (colorDto != null ? colorDto.hashCode() : 0);
    }

    public String toString() {
        return "ExpandableButtonTrayState(expandButton=" + this.expandButton + ", buttons=" + this.buttons + ", prefixContentState=" + this.prefixContentState + ", showWideButtons=" + this.showWideButtons + ", alwaysShowExpandButton=" + this.alwaysShowExpandButton + ", expandAnimationType=" + this.expandAnimationType + ", closeButtonTintOverride=" + this.closeButtonTintOverride + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableButtonTrayState(ExpandButton expandButton, ImmutableList<? extends ActionButton<T>> buttons, PrefixContentState prefixContentState, boolean z, boolean z2, ExpandAnimationType expandAnimationType, ColorDto colorDto) {
        Intrinsics.checkNotNullParameter(expandButton, "expandButton");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(expandAnimationType, "expandAnimationType");
        this.expandButton = expandButton;
        this.buttons = buttons;
        this.prefixContentState = prefixContentState;
        this.showWideButtons = z;
        this.alwaysShowExpandButton = z2;
        this.expandAnimationType = expandAnimationType;
        this.closeButtonTintOverride = colorDto;
    }

    public final ExpandButton getExpandButton() {
        return this.expandButton;
    }

    public /* synthetic */ ExpandableButtonTrayState(ExpandButton expandButton, ImmutableList immutableList, PrefixContentState prefixContentState, boolean z, boolean z2, ExpandAnimationType expandAnimationType, ColorDto colorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(expandButton, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList, (i & 4) != 0 ? null : prefixContentState, (i & 8) != 0 ? false : z, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? ExpandAnimationType.SPRING : expandAnimationType, (i & 64) != 0 ? null : colorDto);
    }

    public final ImmutableList<ActionButton<T>> getButtons() {
        return this.buttons;
    }

    public final PrefixContentState getPrefixContentState() {
        return this.prefixContentState;
    }

    public final boolean getShowWideButtons() {
        return this.showWideButtons;
    }

    public final boolean getAlwaysShowExpandButton() {
        return this.alwaysShowExpandButton;
    }

    public final ExpandAnimationType getExpandAnimationType() {
        return this.expandAnimationType;
    }

    public final ColorDto getCloseButtonTintOverride() {
        return this.closeButtonTintOverride;
    }

    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;", "", "<init>", "()V", "TitleState", "BottomSheetSelector", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState$BottomSheetSelector;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState$TitleState;", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PrefixContentState {
        public static final int $stable = 0;

        public /* synthetic */ PrefixContentState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PrefixContentState() {
        }

        /* compiled from: CryptoExpandableButtonTrayComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState$TitleState;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TitleState extends PrefixContentState {
            public static final int $stable = StringResource.$stable;
            private final StringResource label;
            private final StringResource value;

            public static /* synthetic */ TitleState copy$default(TitleState titleState, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = titleState.label;
                }
                if ((i & 2) != 0) {
                    stringResource2 = titleState.value;
                }
                return titleState.copy(stringResource, stringResource2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getValue() {
                return this.value;
            }

            public final TitleState copy(StringResource label, StringResource value) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(value, "value");
                return new TitleState(label, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TitleState)) {
                    return false;
                }
                TitleState titleState = (TitleState) other;
                return Intrinsics.areEqual(this.label, titleState.label) && Intrinsics.areEqual(this.value, titleState.value);
            }

            public int hashCode() {
                return (this.label.hashCode() * 31) + this.value.hashCode();
            }

            public String toString() {
                return "TitleState(label=" + this.label + ", value=" + this.value + ")";
            }

            public final StringResource getLabel() {
                return this.label;
            }

            public final StringResource getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TitleState(StringResource label, StringResource value) {
                super(null);
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(value, "value");
                this.label = label;
                this.value = value;
            }
        }

        /* compiled from: CryptoExpandableButtonTrayComposable.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState$BottomSheetSelector;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;", "startIcon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size24;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons$Size24;Lcom/robinhood/utils/resource/StringResource;)V", "getStartIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size24;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BottomSheetSelector extends PrefixContentState {
            public static final int $stable = StringResource.$stable | BentoIcon4.Size24.$stable;
            private final BentoIcon4.Size24 startIcon;
            private final StringResource text;

            public static /* synthetic */ BottomSheetSelector copy$default(BottomSheetSelector bottomSheetSelector, BentoIcon4.Size24 size24, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    size24 = bottomSheetSelector.startIcon;
                }
                if ((i & 2) != 0) {
                    stringResource = bottomSheetSelector.text;
                }
                return bottomSheetSelector.copy(size24, stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final BentoIcon4.Size24 getStartIcon() {
                return this.startIcon;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            public final BottomSheetSelector copy(BentoIcon4.Size24 startIcon, StringResource text) {
                Intrinsics.checkNotNullParameter(startIcon, "startIcon");
                Intrinsics.checkNotNullParameter(text, "text");
                return new BottomSheetSelector(startIcon, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BottomSheetSelector)) {
                    return false;
                }
                BottomSheetSelector bottomSheetSelector = (BottomSheetSelector) other;
                return Intrinsics.areEqual(this.startIcon, bottomSheetSelector.startIcon) && Intrinsics.areEqual(this.text, bottomSheetSelector.text);
            }

            public int hashCode() {
                return (this.startIcon.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "BottomSheetSelector(startIcon=" + this.startIcon + ", text=" + this.text + ")";
            }

            public final BentoIcon4.Size24 getStartIcon() {
                return this.startIcon;
            }

            public final StringResource getText() {
                return this.text;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomSheetSelector(BentoIcon4.Size24 startIcon, StringResource text) {
                super(null);
                Intrinsics.checkNotNullParameter(startIcon, "startIcon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.startIcon = startIcon;
                this.text = text;
            }
        }
    }

    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandButton;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "enabled", "", "backgroundColorOverride", "Lrh_server_driven_ui/v1/ColorDto;", "textColorOverride", "borderColorOverride", "loading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZLrh_server_driven_ui/v1/ColorDto;Lrh_server_driven_ui/v1/ColorDto;Lrh_server_driven_ui/v1/ColorDto;Z)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getEnabled", "()Z", "getBackgroundColorOverride", "()Lrh_server_driven_ui/v1/ColorDto;", "getTextColorOverride", "getBorderColorOverride", "getLoading", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExpandButton {
        public static final int $stable = StringResource.$stable;
        private final ColorDto backgroundColorOverride;
        private final ColorDto borderColorOverride;
        private final boolean enabled;
        private final ServerToBentoAssetMapper2 icon;
        private final StringResource label;
        private final boolean loading;
        private final ColorDto textColorOverride;

        public static /* synthetic */ ExpandButton copy$default(ExpandButton expandButton, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, ColorDto colorDto, ColorDto colorDto2, ColorDto colorDto3, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = expandButton.label;
            }
            if ((i & 2) != 0) {
                serverToBentoAssetMapper2 = expandButton.icon;
            }
            if ((i & 4) != 0) {
                z = expandButton.enabled;
            }
            if ((i & 8) != 0) {
                colorDto = expandButton.backgroundColorOverride;
            }
            if ((i & 16) != 0) {
                colorDto2 = expandButton.textColorOverride;
            }
            if ((i & 32) != 0) {
                colorDto3 = expandButton.borderColorOverride;
            }
            if ((i & 64) != 0) {
                z2 = expandButton.loading;
            }
            ColorDto colorDto4 = colorDto3;
            boolean z3 = z2;
            ColorDto colorDto5 = colorDto2;
            boolean z4 = z;
            return expandButton.copy(stringResource, serverToBentoAssetMapper2, z4, colorDto, colorDto5, colorDto4, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final ColorDto getBackgroundColorOverride() {
            return this.backgroundColorOverride;
        }

        /* renamed from: component5, reason: from getter */
        public final ColorDto getTextColorOverride() {
            return this.textColorOverride;
        }

        /* renamed from: component6, reason: from getter */
        public final ColorDto getBorderColorOverride() {
            return this.borderColorOverride;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        public final ExpandButton copy(StringResource label, ServerToBentoAssetMapper2 icon, boolean enabled, ColorDto backgroundColorOverride, ColorDto textColorOverride, ColorDto borderColorOverride, boolean loading) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new ExpandButton(label, icon, enabled, backgroundColorOverride, textColorOverride, borderColorOverride, loading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandButton)) {
                return false;
            }
            ExpandButton expandButton = (ExpandButton) other;
            return Intrinsics.areEqual(this.label, expandButton.label) && this.icon == expandButton.icon && this.enabled == expandButton.enabled && this.backgroundColorOverride == expandButton.backgroundColorOverride && this.textColorOverride == expandButton.textColorOverride && this.borderColorOverride == expandButton.borderColorOverride && this.loading == expandButton.loading;
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
            int iHashCode2 = (((iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31;
            ColorDto colorDto = this.backgroundColorOverride;
            int iHashCode3 = (iHashCode2 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
            ColorDto colorDto2 = this.textColorOverride;
            int iHashCode4 = (iHashCode3 + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
            ColorDto colorDto3 = this.borderColorOverride;
            return ((iHashCode4 + (colorDto3 != null ? colorDto3.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading);
        }

        public String toString() {
            return "ExpandButton(label=" + this.label + ", icon=" + this.icon + ", enabled=" + this.enabled + ", backgroundColorOverride=" + this.backgroundColorOverride + ", textColorOverride=" + this.textColorOverride + ", borderColorOverride=" + this.borderColorOverride + ", loading=" + this.loading + ")";
        }

        public ExpandButton(StringResource label, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, ColorDto colorDto, ColorDto colorDto2, ColorDto colorDto3, boolean z2) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.icon = serverToBentoAssetMapper2;
            this.enabled = z;
            this.backgroundColorOverride = colorDto;
            this.textColorOverride = colorDto2;
            this.borderColorOverride = colorDto3;
            this.loading = z2;
        }

        public /* synthetic */ ExpandButton(StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, ColorDto colorDto, ColorDto colorDto2, ColorDto colorDto3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : serverToBentoAssetMapper2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : colorDto, (i & 16) != 0 ? null : colorDto2, (i & 32) != 0 ? null : colorDto3, (i & 64) != 0 ? false : z2);
        }

        public final StringResource getLabel() {
            return this.label;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ColorDto getBackgroundColorOverride() {
            return this.backgroundColorOverride;
        }

        public final ColorDto getTextColorOverride() {
            return this.textColorOverride;
        }

        public final ColorDto getBorderColorOverride() {
            return this.borderColorOverride;
        }

        public final boolean getLoading() {
            return this.loading;
        }
    }

    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "T", "", "<init>", "()V", "CustomButton", "SduiButton", "IdlButton", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$CustomButton;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$IdlButton;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$SduiButton;", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ActionButton<T> {
        public static final int $stable = 0;

        public /* synthetic */ ActionButton(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionButton() {
        }

        /* compiled from: CryptoExpandableButtonTrayComposable.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00018\u0002HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jx\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$CustomButton;", "T", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "onClickAction", "type", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "textColorOverride", "Lrh_server_driven_ui/v1/ColorDto;", "backgroundColorOverride", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "enabled", "", "loading", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Object;Lcom/robinhood/compose/bento/component/BentoButtons$Type;Lrh_server_driven_ui/v1/ColorDto;Lrh_server_driven_ui/v1/ColorDto;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZLcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getOnClickAction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getType", "()Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "getTextColorOverride", "()Lrh_server_driven_ui/v1/ColorDto;", "getBackgroundColorOverride", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getEnabled", "()Z", "getLoading", "getEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Object;Lcom/robinhood/compose/bento/component/BentoButtons$Type;Lrh_server_driven_ui/v1/ColorDto;Lrh_server_driven_ui/v1/ColorDto;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZLcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$CustomButton;", "equals", "other", "", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CustomButton<T> extends ActionButton<T> {
            public static final int $stable = 8;
            private final ColorDto backgroundColorOverride;
            private final boolean enabled;
            private final UserInteractionEventDescriptor eventDescriptor;
            private final ServerToBentoAssetMapper2 icon;
            private final StringResource label;
            private final boolean loading;
            private final T onClickAction;
            private final ColorDto textColorOverride;
            private final BentoButtons.Type type;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CustomButton copy$default(CustomButton customButton, StringResource stringResource, Object obj, BentoButtons.Type type2, ColorDto colorDto, ColorDto colorDto2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj2) {
                if ((i & 1) != 0) {
                    stringResource = customButton.label;
                }
                T t = obj;
                if ((i & 2) != 0) {
                    t = customButton.onClickAction;
                }
                if ((i & 4) != 0) {
                    type2 = customButton.type;
                }
                if ((i & 8) != 0) {
                    colorDto = customButton.textColorOverride;
                }
                if ((i & 16) != 0) {
                    colorDto2 = customButton.backgroundColorOverride;
                }
                if ((i & 32) != 0) {
                    serverToBentoAssetMapper2 = customButton.icon;
                }
                if ((i & 64) != 0) {
                    z = customButton.enabled;
                }
                if ((i & 128) != 0) {
                    z2 = customButton.loading;
                }
                if ((i & 256) != 0) {
                    userInteractionEventDescriptor = customButton.eventDescriptor;
                }
                boolean z3 = z2;
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                boolean z4 = z;
                ColorDto colorDto3 = colorDto2;
                BentoButtons.Type type3 = type2;
                return customButton.copy(stringResource, t, type3, colorDto, colorDto3, serverToBentoAssetMapper22, z4, z3, userInteractionEventDescriptor2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLabel() {
                return this.label;
            }

            public final T component2() {
                return this.onClickAction;
            }

            /* renamed from: component3, reason: from getter */
            public final BentoButtons.Type getType() {
                return this.type;
            }

            /* renamed from: component4, reason: from getter */
            public final ColorDto getTextColorOverride() {
                return this.textColorOverride;
            }

            /* renamed from: component5, reason: from getter */
            public final ColorDto getBackgroundColorOverride() {
                return this.backgroundColorOverride;
            }

            /* renamed from: component6, reason: from getter */
            public final ServerToBentoAssetMapper2 getIcon() {
                return this.icon;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getLoading() {
                return this.loading;
            }

            /* renamed from: component9, reason: from getter */
            public final UserInteractionEventDescriptor getEventDescriptor() {
                return this.eventDescriptor;
            }

            public final CustomButton<T> copy(StringResource label, T onClickAction, BentoButtons.Type type2, ColorDto textColorOverride, ColorDto backgroundColorOverride, ServerToBentoAssetMapper2 icon, boolean enabled, boolean loading, UserInteractionEventDescriptor eventDescriptor) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(type2, "type");
                return new CustomButton<>(label, onClickAction, type2, textColorOverride, backgroundColorOverride, icon, enabled, loading, eventDescriptor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomButton)) {
                    return false;
                }
                CustomButton customButton = (CustomButton) other;
                return Intrinsics.areEqual(this.label, customButton.label) && Intrinsics.areEqual(this.onClickAction, customButton.onClickAction) && this.type == customButton.type && this.textColorOverride == customButton.textColorOverride && this.backgroundColorOverride == customButton.backgroundColorOverride && this.icon == customButton.icon && this.enabled == customButton.enabled && this.loading == customButton.loading && Intrinsics.areEqual(this.eventDescriptor, customButton.eventDescriptor);
            }

            public int hashCode() {
                int iHashCode = this.label.hashCode() * 31;
                T t = this.onClickAction;
                int iHashCode2 = (((iHashCode + (t == null ? 0 : t.hashCode())) * 31) + this.type.hashCode()) * 31;
                ColorDto colorDto = this.textColorOverride;
                int iHashCode3 = (iHashCode2 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
                ColorDto colorDto2 = this.backgroundColorOverride;
                int iHashCode4 = (iHashCode3 + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
                int iHashCode5 = (((((iHashCode4 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.loading)) * 31;
                UserInteractionEventDescriptor userInteractionEventDescriptor = this.eventDescriptor;
                return iHashCode5 + (userInteractionEventDescriptor != null ? userInteractionEventDescriptor.hashCode() : 0);
            }

            public String toString() {
                return "CustomButton(label=" + this.label + ", onClickAction=" + this.onClickAction + ", type=" + this.type + ", textColorOverride=" + this.textColorOverride + ", backgroundColorOverride=" + this.backgroundColorOverride + ", icon=" + this.icon + ", enabled=" + this.enabled + ", loading=" + this.loading + ", eventDescriptor=" + this.eventDescriptor + ")";
            }

            public final StringResource getLabel() {
                return this.label;
            }

            public final T getOnClickAction() {
                return this.onClickAction;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CustomButton(com.robinhood.utils.resource.StringResource r11, java.lang.Object r12, com.robinhood.compose.bento.component.BentoButtons.Type r13, rh_server_driven_ui.p531v1.ColorDto r14, rh_server_driven_ui.p531v1.ColorDto r15, com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2 r16, boolean r17, boolean r18, com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
                /*
                    r10 = this;
                    r0 = r20
                    r1 = r0 & 4
                    if (r1 == 0) goto L8
                    com.robinhood.compose.bento.component.BentoButtons$Type r13 = com.robinhood.compose.bento.component.BentoButtons.Type.Primary
                L8:
                    r3 = r13
                    r13 = r0 & 8
                    r1 = 0
                    if (r13 == 0) goto L10
                    r4 = r1
                    goto L11
                L10:
                    r4 = r14
                L11:
                    r13 = r0 & 16
                    if (r13 == 0) goto L17
                    r5 = r1
                    goto L18
                L17:
                    r5 = r15
                L18:
                    r13 = r0 & 32
                    if (r13 == 0) goto L1e
                    r6 = r1
                    goto L20
                L1e:
                    r6 = r16
                L20:
                    r13 = r0 & 64
                    if (r13 == 0) goto L27
                    r13 = 1
                    r7 = r13
                    goto L29
                L27:
                    r7 = r17
                L29:
                    r13 = r0 & 128(0x80, float:1.794E-43)
                    if (r13 == 0) goto L30
                    r13 = 0
                    r8 = r13
                    goto L32
                L30:
                    r8 = r18
                L32:
                    r13 = r0 & 256(0x100, float:3.59E-43)
                    if (r13 == 0) goto L3b
                    r9 = r1
                    r0 = r10
                    r2 = r12
                    r1 = r11
                    goto L40
                L3b:
                    r9 = r19
                    r0 = r10
                    r1 = r11
                    r2 = r12
                L40:
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState.ActionButton.CustomButton.<init>(com.robinhood.utils.resource.StringResource, java.lang.Object, com.robinhood.compose.bento.component.BentoButtons$Type, rh_server_driven_ui.v1.ColorDto, rh_server_driven_ui.v1.ColorDto, com.robinhood.android.libdesignsystem.serverui.IconAsset, boolean, boolean, com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public final BentoButtons.Type getType() {
                return this.type;
            }

            public final ColorDto getTextColorOverride() {
                return this.textColorOverride;
            }

            public final ColorDto getBackgroundColorOverride() {
                return this.backgroundColorOverride;
            }

            public final ServerToBentoAssetMapper2 getIcon() {
                return this.icon;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final boolean getLoading() {
                return this.loading;
            }

            public final UserInteractionEventDescriptor getEventDescriptor() {
                return this.eventDescriptor;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomButton(StringResource label, T t, BentoButtons.Type type2, ColorDto colorDto, ColorDto colorDto2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, UserInteractionEventDescriptor userInteractionEventDescriptor) {
                super(null);
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(type2, "type");
                this.label = label;
                this.onClickAction = t;
                this.type = type2;
                this.textColorOverride = colorDto;
                this.backgroundColorOverride = colorDto2;
                this.icon = serverToBentoAssetMapper2;
                this.enabled = z;
                this.loading = z2;
                this.eventDescriptor = userInteractionEventDescriptor;
            }
        }

        /* compiled from: CryptoExpandableButtonTrayComposable.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$SduiButton;", "T", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "button", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Button;)V", "getButton", "()Lcom/robinhood/models/serverdriven/experimental/api/Button;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SduiButton<T> extends ActionButton<T> {
            public static final int $stable = 8;
            private final Button<GenericAction> button;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SduiButton copy$default(SduiButton sduiButton, Button button, int i, Object obj) {
                if ((i & 1) != 0) {
                    button = sduiButton.button;
                }
                return sduiButton.copy(button);
            }

            public final Button<GenericAction> component1() {
                return this.button;
            }

            public final SduiButton<T> copy(Button<? extends GenericAction> button) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new SduiButton<>(button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SduiButton) && Intrinsics.areEqual(this.button, ((SduiButton) other).button);
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            public String toString() {
                return "SduiButton(button=" + this.button + ")";
            }

            public final Button<GenericAction> getButton() {
                return this.button;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public SduiButton(Button<? extends GenericAction> button) {
                super(null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }
        }

        /* compiled from: CryptoExpandableButtonTrayComposable.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$IdlButton;", "T", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "button", "Lrh_server_driven_ui/v1/ButtonDto;", "<init>", "(Lrh_server_driven_ui/v1/ButtonDto;)V", "getButton", "()Lrh_server_driven_ui/v1/ButtonDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IdlButton<T> extends ActionButton<T> {
            public static final int $stable = 8;
            private final ButtonDto button;

            public static /* synthetic */ IdlButton copy$default(IdlButton idlButton, ButtonDto buttonDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    buttonDto = idlButton.button;
                }
                return idlButton.copy(buttonDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ButtonDto getButton() {
                return this.button;
            }

            public final IdlButton<T> copy(ButtonDto button) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new IdlButton<>(button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IdlButton) && Intrinsics.areEqual(this.button, ((IdlButton) other).button);
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            public String toString() {
                return "IdlButton(button=" + this.button + ")";
            }

            public final ButtonDto getButton() {
                return this.button;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IdlButton(ButtonDto button) {
                super(null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandAnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "SPRING", "BOUNCE_ON_EXPAND", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ExpandAnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ExpandAnimationType[] $VALUES;
        public static final ExpandAnimationType SPRING = new ExpandAnimationType("SPRING", 0);
        public static final ExpandAnimationType BOUNCE_ON_EXPAND = new ExpandAnimationType("BOUNCE_ON_EXPAND", 1);

        private static final /* synthetic */ ExpandAnimationType[] $values() {
            return new ExpandAnimationType[]{SPRING, BOUNCE_ON_EXPAND};
        }

        public static EnumEntries<ExpandAnimationType> getEntries() {
            return $ENTRIES;
        }

        private ExpandAnimationType(String str, int i) {
        }

        static {
            ExpandAnimationType[] expandAnimationTypeArr$values = $values();
            $VALUES = expandAnimationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(expandAnimationTypeArr$values);
        }

        public static ExpandAnimationType valueOf(String str) {
            return (ExpandAnimationType) Enum.valueOf(ExpandAnimationType.class, str);
        }

        public static ExpandAnimationType[] values() {
            return (ExpandAnimationType[]) $VALUES.clone();
        }
    }
}
