package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreferencesFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\n\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Landroidx/datastore/preferences/core/Preferences;", "createEmpty", "()Landroidx/datastore/preferences/core/Preferences;", "emptyPreferences", "", "Landroidx/datastore/preferences/core/Preferences$Pair;", "pairs", "Landroidx/datastore/preferences/core/MutablePreferences;", "createMutable", "([Landroidx/datastore/preferences/core/Preferences$Pair;)Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePreferencesOf", "datastore-preferences-core"}, m3637k = 2, m3638mv = {1, 5, 1}, m3640xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class PreferencesFactory {
    @JvmName
    public static final Preferences createEmpty() {
        return new Preferences2(null, true, 1, null);
    }

    @JvmName
    public static final Preferences2 createMutable(Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Preferences2 preferences2 = new Preferences2(null, false, 1, null);
        preferences2.putAll((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
        return preferences2;
    }
}
