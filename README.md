# robinhood-decompiled

This repo is a consolidated view of a decompiled Robinhood Android app plus an audit bundle.

## Quick map (start here)

- Decompiled app tree:
  - Code: `app/sources/`
  - Resources: `app/resources/` (includes `AndroidManifest.xml` and `META-INF/`)
- Audit bundle:
  - Reports: `audit/reports/`
  - Manifest/meta: `audit/manifest/`, `audit/meta/`
  - Protos: `audit/protos/`
  - Curated subset: `audit/sources/`, `audit/resources/`

## Why the repo is structured this way

Decompilation output is not a normal Android Studio project. The goal here is navigation and review:

- `app/` is the single canonical \"full fidelity\" decompile output (includes native libs under `app/resources/lib/*.so` when present).
- `audit/` is review-oriented material (indices, extracted manifest/meta, collected protos, and a curated subset of sources/resources).

## Notes / caveats

- Decompiled sources are not buildable as-is.
- Decompilers are not fully deterministic; naming/numbering differences can exist across runs even when behavior is unchanged.
