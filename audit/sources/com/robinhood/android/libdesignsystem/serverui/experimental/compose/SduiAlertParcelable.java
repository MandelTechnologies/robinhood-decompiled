package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment2;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiAlert.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J0\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiAlertParcelable;", "Lcom/robinhood/android/common/ui/ParcelableComposable;", "forAchromatic", "", "bodyComponentsList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/Boolean;Lkotlinx/collections/immutable/ImmutableList;)V", "getForAchromatic", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBodyComponentsList", "()Lkotlinx/collections/immutable/ImmutableList;", "Content", "", "themesFromScarlet", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "(Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lkotlinx/collections/immutable/ImmutableList;)Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiAlertParcelable;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
final /* data */ class SduiAlertParcelable implements RhBottomSheetDialogFragment2 {
    public static final Parcelable.Creator<SduiAlertParcelable> CREATOR = new Creator();
    private final ImmutableList<UIComponent<Parcelable>> bodyComponentsList;
    private final Boolean forAchromatic;

    /* compiled from: SduiAlert.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SduiAlertParcelable> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SduiAlertParcelable createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SduiAlertParcelable.class.getClassLoader()));
            }
            return new SduiAlertParcelable(boolValueOf, extensions2.toPersistentList(arrayList));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SduiAlertParcelable[] newArray(int i) {
            return new SduiAlertParcelable[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(SduiAlertParcelable sduiAlertParcelable, ThemesFromScarlet themesFromScarlet, int i, Composer composer, int i2) {
        sduiAlertParcelable.Content(themesFromScarlet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SduiAlertParcelable copy$default(SduiAlertParcelable sduiAlertParcelable, Boolean bool, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sduiAlertParcelable.forAchromatic;
        }
        if ((i & 2) != 0) {
            immutableList = sduiAlertParcelable.bodyComponentsList;
        }
        return sduiAlertParcelable.copy(bool, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getForAchromatic() {
        return this.forAchromatic;
    }

    public final ImmutableList<UIComponent<Parcelable>> component2() {
        return this.bodyComponentsList;
    }

    public final SduiAlertParcelable copy(Boolean forAchromatic, ImmutableList<? extends UIComponent<? extends Parcelable>> bodyComponentsList) {
        Intrinsics.checkNotNullParameter(bodyComponentsList, "bodyComponentsList");
        return new SduiAlertParcelable(forAchromatic, bodyComponentsList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiAlertParcelable)) {
            return false;
        }
        SduiAlertParcelable sduiAlertParcelable = (SduiAlertParcelable) other;
        return Intrinsics.areEqual(this.forAchromatic, sduiAlertParcelable.forAchromatic) && Intrinsics.areEqual(this.bodyComponentsList, sduiAlertParcelable.bodyComponentsList);
    }

    public int hashCode() {
        Boolean bool = this.forAchromatic;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.bodyComponentsList.hashCode();
    }

    public String toString() {
        return "SduiAlertParcelable(forAchromatic=" + this.forAchromatic + ", bodyComponentsList=" + this.bodyComponentsList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.forAchromatic;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        ImmutableList<UIComponent<Parcelable>> immutableList = this.bodyComponentsList;
        dest.writeInt(immutableList.size());
        Iterator<UIComponent<Parcelable>> it = immutableList.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SduiAlertParcelable(Boolean bool, ImmutableList<? extends UIComponent<? extends Parcelable>> bodyComponentsList) {
        Intrinsics.checkNotNullParameter(bodyComponentsList, "bodyComponentsList");
        this.forAchromatic = bool;
        this.bodyComponentsList = bodyComponentsList;
    }

    public final Boolean getForAchromatic() {
        return this.forAchromatic;
    }

    public final ImmutableList<UIComponent<Parcelable>> getBodyComponentsList() {
        return this.bodyComponentsList;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment2
    public void Content(final ThemesFromScarlet themesFromScarlet, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(themesFromScarlet, "themesFromScarlet");
        Composer composerStartRestartGroup = composer.startRestartGroup(683298879);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(themesFromScarlet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(683298879, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertParcelable.Content (SduiAlert.kt:549)");
            }
            Boolean bool = this.forAchromatic;
            ThemesFromScarlet themesFromScarletCopy$default = ThemesFromScarlet.copy$default(themesFromScarlet, false, false, false, bool != null ? bool.booleanValue() : themesFromScarlet.isAchromatic(), false, null, 55, null);
            Observable observableJust = Observable.just(themesFromScarletCopy$default);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(observableJust, themesFromScarletCopy$default, ComposableLambda3.rememberComposableLambda(-1509049779, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertParcelable.Content.1
                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1509049779, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertParcelable.Content.<anonymous> (SduiAlert.kt:557)");
                    }
                    ImmutableList<UIComponent<Parcelable>> bodyComponentsList = SduiAlertParcelable.this.getBodyComponentsList();
                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                    composer3.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(bodyComponentsList, Parcelable.class, Modifier.INSTANCE, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 196608, 0);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertParcelable$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAlertParcelable.Content$lambda$0(this.f$0, themesFromScarlet, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
