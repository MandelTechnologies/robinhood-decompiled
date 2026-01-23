package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RhyOverviewNuxViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "", "Hidden", "Loading", "Loaded", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState$Loaded;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState$Loading;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RhyOverviewNuxViewState {

    /* compiled from: RhyOverviewNuxViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Hidden implements RhyOverviewNuxViewState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
        }
    }

    /* compiled from: RhyOverviewNuxViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState$Loading;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RhyOverviewNuxViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RhyOverviewNuxViewState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003JM\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState$Loaded;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "titleResource", "Lcom/robinhood/utils/resource/StringResource;", "nuxItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "cardId", "Ljava/util/UUID;", "hasDdRelationship", "", "hasClickedDirectDepositNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "showDebugAddCardToGooglePayDialog", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Ljava/util/UUID;ZLcom/robinhood/prefs/BooleanPreference;Z)V", "getTitleResource", "()Lcom/robinhood/utils/resource/StringResource;", "getNuxItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getCardId", "()Ljava/util/UUID;", "getHasDdRelationship", "()Z", "getHasClickedDirectDepositNuxPref", "()Lcom/robinhood/prefs/BooleanPreference;", "getShowDebugAddCardToGooglePayDialog", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded implements RhyOverviewNuxViewState {
        public static final int $stable = 8;
        private final UUID cardId;
        private final BooleanPreference hasClickedDirectDepositNuxPref;
        private final boolean hasDdRelationship;
        private final ImmutableList<NuxItem> nuxItems;
        private final boolean showDebugAddCardToGooglePayDialog;
        private final StringResource titleResource;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, ImmutableList immutableList, UUID uuid, boolean z, BooleanPreference booleanPreference, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.titleResource;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.nuxItems;
            }
            if ((i & 4) != 0) {
                uuid = loaded.cardId;
            }
            if ((i & 8) != 0) {
                z = loaded.hasDdRelationship;
            }
            if ((i & 16) != 0) {
                booleanPreference = loaded.hasClickedDirectDepositNuxPref;
            }
            if ((i & 32) != 0) {
                z2 = loaded.showDebugAddCardToGooglePayDialog;
            }
            BooleanPreference booleanPreference2 = booleanPreference;
            boolean z3 = z2;
            return loaded.copy(stringResource, immutableList, uuid, z, booleanPreference2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitleResource() {
            return this.titleResource;
        }

        public final ImmutableList<NuxItem> component2() {
            return this.nuxItems;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getCardId() {
            return this.cardId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasDdRelationship() {
            return this.hasDdRelationship;
        }

        /* renamed from: component5, reason: from getter */
        public final BooleanPreference getHasClickedDirectDepositNuxPref() {
            return this.hasClickedDirectDepositNuxPref;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowDebugAddCardToGooglePayDialog() {
            return this.showDebugAddCardToGooglePayDialog;
        }

        public final Loaded copy(StringResource titleResource, ImmutableList<? extends NuxItem> nuxItems, UUID cardId, boolean hasDdRelationship, BooleanPreference hasClickedDirectDepositNuxPref, boolean showDebugAddCardToGooglePayDialog) {
            Intrinsics.checkNotNullParameter(titleResource, "titleResource");
            Intrinsics.checkNotNullParameter(nuxItems, "nuxItems");
            Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
            return new Loaded(titleResource, nuxItems, cardId, hasDdRelationship, hasClickedDirectDepositNuxPref, showDebugAddCardToGooglePayDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.titleResource, loaded.titleResource) && Intrinsics.areEqual(this.nuxItems, loaded.nuxItems) && Intrinsics.areEqual(this.cardId, loaded.cardId) && this.hasDdRelationship == loaded.hasDdRelationship && Intrinsics.areEqual(this.hasClickedDirectDepositNuxPref, loaded.hasClickedDirectDepositNuxPref) && this.showDebugAddCardToGooglePayDialog == loaded.showDebugAddCardToGooglePayDialog;
        }

        public int hashCode() {
            int iHashCode = ((this.titleResource.hashCode() * 31) + this.nuxItems.hashCode()) * 31;
            UUID uuid = this.cardId;
            return ((((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.hasDdRelationship)) * 31) + this.hasClickedDirectDepositNuxPref.hashCode()) * 31) + Boolean.hashCode(this.showDebugAddCardToGooglePayDialog);
        }

        public String toString() {
            return "Loaded(titleResource=" + this.titleResource + ", nuxItems=" + this.nuxItems + ", cardId=" + this.cardId + ", hasDdRelationship=" + this.hasDdRelationship + ", hasClickedDirectDepositNuxPref=" + this.hasClickedDirectDepositNuxPref + ", showDebugAddCardToGooglePayDialog=" + this.showDebugAddCardToGooglePayDialog + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(StringResource titleResource, ImmutableList<? extends NuxItem> nuxItems, UUID uuid, boolean z, BooleanPreference hasClickedDirectDepositNuxPref, boolean z2) {
            Intrinsics.checkNotNullParameter(titleResource, "titleResource");
            Intrinsics.checkNotNullParameter(nuxItems, "nuxItems");
            Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
            this.titleResource = titleResource;
            this.nuxItems = nuxItems;
            this.cardId = uuid;
            this.hasDdRelationship = z;
            this.hasClickedDirectDepositNuxPref = hasClickedDirectDepositNuxPref;
            this.showDebugAddCardToGooglePayDialog = z2;
        }

        public /* synthetic */ Loaded(StringResource stringResource, ImmutableList immutableList, UUID uuid, boolean z, BooleanPreference booleanPreference, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, immutableList, uuid, z, booleanPreference, (i & 32) != 0 ? false : z2);
        }

        public final StringResource getTitleResource() {
            return this.titleResource;
        }

        public final ImmutableList<NuxItem> getNuxItems() {
            return this.nuxItems;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final boolean getHasDdRelationship() {
            return this.hasDdRelationship;
        }

        public final BooleanPreference getHasClickedDirectDepositNuxPref() {
            return this.hasClickedDirectDepositNuxPref;
        }

        public final boolean getShowDebugAddCardToGooglePayDialog() {
            return this.showDebugAddCardToGooglePayDialog;
        }

        @JvmName
        public final String getTitle(Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040679325, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxViewState.Loaded.<get-title> (RhyOverviewNuxViewState.kt:28)");
            }
            StringResource stringResource = this.titleResource;
            Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = stringResource.getText(resources).toString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return string2;
        }
    }
}
