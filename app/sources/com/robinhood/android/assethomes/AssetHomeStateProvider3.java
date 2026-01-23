package com.robinhood.android.assethomes;

import android.net.Uri;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "", "AssetHomeBottomBarActionIntentKey", "AssetHomeBottomBarActionFragmentKey", "AssetHomeBottomBarActionUri", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction$AssetHomeBottomBarActionFragmentKey;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction$AssetHomeBottomBarActionIntentKey;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction$AssetHomeBottomBarActionUri;", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBarAction, reason: use source file name */
/* loaded from: classes7.dex */
public interface AssetHomeStateProvider3 {

    /* compiled from: AssetHomeStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction$AssetHomeBottomBarActionIntentKey;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBarAction$AssetHomeBottomBarActionIntentKey, reason: from toString */
    public static final /* data */ class AssetHomeBottomBarActionIntentKey implements AssetHomeStateProvider3 {
        public static final int $stable = 8;
        private final IntentKey intentKey;

        public static /* synthetic */ AssetHomeBottomBarActionIntentKey copy$default(AssetHomeBottomBarActionIntentKey assetHomeBottomBarActionIntentKey, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = assetHomeBottomBarActionIntentKey.intentKey;
            }
            return assetHomeBottomBarActionIntentKey.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final AssetHomeBottomBarActionIntentKey copy(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new AssetHomeBottomBarActionIntentKey(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AssetHomeBottomBarActionIntentKey) && Intrinsics.areEqual(this.intentKey, ((AssetHomeBottomBarActionIntentKey) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "AssetHomeBottomBarActionIntentKey(intentKey=" + this.intentKey + ")";
        }

        public AssetHomeBottomBarActionIntentKey(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }

    /* compiled from: AssetHomeStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction$AssetHomeBottomBarActionFragmentKey;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBarAction$AssetHomeBottomBarActionFragmentKey, reason: from toString */
    public static final /* data */ class AssetHomeBottomBarActionFragmentKey implements AssetHomeStateProvider3 {
        public static final int $stable = 8;
        private final DialogFragmentKey dialogFragmentKey;

        public static /* synthetic */ AssetHomeBottomBarActionFragmentKey copy$default(AssetHomeBottomBarActionFragmentKey assetHomeBottomBarActionFragmentKey, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = assetHomeBottomBarActionFragmentKey.dialogFragmentKey;
            }
            return assetHomeBottomBarActionFragmentKey.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        public final AssetHomeBottomBarActionFragmentKey copy(DialogFragmentKey dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            return new AssetHomeBottomBarActionFragmentKey(dialogFragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AssetHomeBottomBarActionFragmentKey) && Intrinsics.areEqual(this.dialogFragmentKey, ((AssetHomeBottomBarActionFragmentKey) other).dialogFragmentKey);
        }

        public int hashCode() {
            return this.dialogFragmentKey.hashCode();
        }

        public String toString() {
            return "AssetHomeBottomBarActionFragmentKey(dialogFragmentKey=" + this.dialogFragmentKey + ")";
        }

        public AssetHomeBottomBarActionFragmentKey(DialogFragmentKey dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.dialogFragmentKey = dialogFragmentKey;
        }

        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }
    }

    /* compiled from: AssetHomeStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction$AssetHomeBottomBarActionUri;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBarAction$AssetHomeBottomBarActionUri, reason: from toString */
    public static final /* data */ class AssetHomeBottomBarActionUri implements AssetHomeStateProvider3 {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ AssetHomeBottomBarActionUri copy$default(AssetHomeBottomBarActionUri assetHomeBottomBarActionUri, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = assetHomeBottomBarActionUri.uri;
            }
            return assetHomeBottomBarActionUri.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final AssetHomeBottomBarActionUri copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new AssetHomeBottomBarActionUri(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AssetHomeBottomBarActionUri) && Intrinsics.areEqual(this.uri, ((AssetHomeBottomBarActionUri) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "AssetHomeBottomBarActionUri(uri=" + this.uri + ")";
        }

        public AssetHomeBottomBarActionUri(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }
}
