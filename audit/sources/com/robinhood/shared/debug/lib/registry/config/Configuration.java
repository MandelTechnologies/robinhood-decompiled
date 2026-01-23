package com.robinhood.shared.debug.lib.registry.config;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Configuration.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/debug/lib/registry/config/Configuration;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Intent", "Fragment", "DialogFragment", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$DialogFragment;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Fragment;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Intent;", "lib-registry-config_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class Configuration {
    private final String name;

    public /* synthetic */ Configuration(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private Configuration(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: Configuration.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Intent;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration;", "name", "", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "lib-registry-config_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Intent extends Configuration {
        private final IntentKey key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Intent(String name, IntentKey key) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final IntentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: Configuration.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Fragment;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration;", "name", "", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "showInStandaloneRdsActivity", "", "requiresAuthentication", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentKey;ZZ)V", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getShowInStandaloneRdsActivity", "()Z", "getRequiresAuthentication", "lib-registry-config_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Fragment extends Configuration {
        private final FragmentKey key;
        private final boolean requiresAuthentication;
        private final boolean showInStandaloneRdsActivity;

        public /* synthetic */ Fragment(String str, FragmentKey fragmentKey, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, fragmentKey, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
        }

        public final FragmentKey getKey() {
            return this.key;
        }

        public final boolean getShowInStandaloneRdsActivity() {
            return this.showInStandaloneRdsActivity;
        }

        public final boolean getRequiresAuthentication() {
            return this.requiresAuthentication;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(String name, FragmentKey key, boolean z, boolean z2) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.showInStandaloneRdsActivity = z;
            this.requiresAuthentication = z2;
        }
    }

    /* compiled from: Configuration.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/debug/lib/registry/config/Configuration$DialogFragment;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration;", "name", "", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "lib-registry-config_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DialogFragment extends Configuration {
        private final DialogFragmentKey key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogFragment(String name, DialogFragmentKey key) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final DialogFragmentKey getKey() {
            return this.key;
        }
    }
}
