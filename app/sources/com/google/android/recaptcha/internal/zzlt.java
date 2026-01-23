package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzlt implements zznp {
    static final zznp zza = new zzlt();

    private zzlt() {
    }

    @Override // com.google.android.recaptcha.internal.zznp
    public final boolean zza(int i) {
        zzlu zzluVar;
        zzlu zzluVar2 = zzlu.EDITION_UNKNOWN;
        if (i == 0) {
            zzluVar = zzlu.EDITION_UNKNOWN;
        } else if (i == 1) {
            zzluVar = zzlu.EDITION_1_TEST_ONLY;
        } else if (i == 2) {
            zzluVar = zzlu.EDITION_2_TEST_ONLY;
        } else if (i == 900) {
            zzluVar = zzlu.EDITION_LEGACY;
        } else if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 998:
                    zzluVar = zzlu.EDITION_PROTO2;
                    break;
                case 999:
                    zzluVar = zzlu.EDITION_PROTO3;
                    break;
                case 1000:
                    zzluVar = zzlu.EDITION_2023;
                    break;
                case 1001:
                    zzluVar = zzlu.EDITION_2024;
                    break;
                default:
                    switch (i) {
                        case 99997:
                            zzluVar = zzlu.EDITION_99997_TEST_ONLY;
                            break;
                        case 99998:
                            zzluVar = zzlu.EDITION_99998_TEST_ONLY;
                            break;
                        case 99999:
                            zzluVar = zzlu.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzluVar = null;
                            break;
                    }
            }
        } else {
            zzluVar = zzlu.EDITION_MAX;
        }
        return zzluVar != null;
    }
}
