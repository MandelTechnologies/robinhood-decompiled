package com.twilio.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: Preferences.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007²\u0006\u0012\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00010\u0001X\u008a\u0084\u0002"}, m3636d2 = {"sharedPreferences", "Landroid/content/SharedPreferences;", "sharedPreferencesFactory", "stringPreference", "Lkotlin/properties/ReadWriteProperty;", "", "", "shared-internal_release", "regularPreferences", "kotlin.jvm.PlatformType"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.PreferencesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Preferences4 {
    private static final SharedPreferences sharedPreferences = sharedPreferencesFactory();

    private static final SharedPreferences sharedPreferencesFactory() {
        final Context applicationContext = ApplicationContextHolder.getApplicationContext();
        Lazy lazy = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.twilio.util.PreferencesKt$sharedPreferencesFactory$regularPreferences$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return applicationContext.getSharedPreferences("TwilioPreferencesPre23", 0);
            }
        });
        try {
            SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create("TwilioPreferences", MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC), applicationContext, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(...)");
            return sharedPreferencesCreate;
        } catch (Throwable th) {
            TwilioLogger.INSTANCE.getLogger("sharedPreferencesFactory").m3202w("Error creating EncryptedSharedPreferences, falling back to regular SharedPreferences", th);
            SharedPreferences sharedPreferencesSharedPreferencesFactory$lambda$0 = sharedPreferencesFactory$lambda$0(lazy);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesSharedPreferencesFactory$lambda$0, "sharedPreferencesFactory$lambda$0(...)");
            return sharedPreferencesSharedPreferencesFactory$lambda$0;
        }
    }

    private static final SharedPreferences sharedPreferencesFactory$lambda$0(Lazy<? extends SharedPreferences> lazy) {
        return lazy.getValue();
    }

    public static final Interfaces3<Object, String> stringPreference() {
        return new Interfaces3<Object, String>() { // from class: com.twilio.util.PreferencesKt.stringPreference.1
            @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue(obj, (KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.Interfaces3
            public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, String str) {
                setValue2(obj, (KProperty<?>) kProperty, str);
            }

            @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
            public String getValue(Object thisRef, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                String string2 = Preferences4.sharedPreferences.getString(property.getName(), "");
                Intrinsics.checkNotNull(string2);
                return string2;
            }

            /* renamed from: setValue, reason: avoid collision after fix types in other method */
            public void setValue2(Object thisRef, KProperty<?> property, String value) {
                Intrinsics.checkNotNullParameter(property, "property");
                Intrinsics.checkNotNullParameter(value, "value");
                Preferences4.sharedPreferences.edit().putString(property.getName(), value).apply();
            }
        };
    }
}
